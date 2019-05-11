package broker.util

import java.awt.*
import java.swing.*

import javax.swing.JTextArea
import javax.swing.WindowConstants;

import broker.test.MGridVM;
import groovy.swing.*

class Terminal {
	private SwingBuilder sb = new SwingBuilder()
	private BorderLayout bl = new BorderLayout()
	private JTextArea t;

	private def broker;

	public void showHierarchy()
	{
		brokerHierachy(broker)
	}

	private void brokerHierachy(def broker)
	{
		if(broker == null) return

			Object lock = this
		Thread.start {
			while(true)
			{
				clear()
				String str = broker.stateToString()
				printWithoutTime(str)

				synchronized(lock)
				{
					lock.wait(1000)
				}
			}
		}
	}

	public synchronized print(String str)
	{
		if(!str.contains("\n"))
			str = str.concat("\n")
		t.append(' ['+ Calendar.instance.timeInMillis  +'] '+t.getLineCount()+":\t" + str)
	}

	public synchronized printWithoutTime(String str)
	{
		if(str == null || str.empty) return;
		if(str.contains("\n"))
		{
			def list = str.split("\n");
			list.each {
				String s -> t.append(t.getLineCount()+":\t" + s + "\n")
			}
			return
		}

		if(!str.contains("\n"))
		{
			str = str.concat("\n")
			t.append(t.getLineCount()+":\t" + str)
			return
		}

	}

	public synchronized  clear()
	{
		t.text = '';
	}

	private init(String name) {

		if(MGridVM.bench) return;
		sb.frame(id:"termFrame",title:name, size:[640,480], visible:true, layout: bl,
		defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE)
		{
			lookAndFeel('system')
			scrollPane()
			{
				t = textArea()

				if(System.getProperty("os.name").equals("Linux"))
				{
					t.setFont(new Font("Monospace",Font.PLAIN,12))
				}
				else
				{
					def font = t.getFont()
					//float size = 22
					float size = 12
					t.setFont(font.deriveFont(size))
				}

				t.background = Color.BLACK
				t.foreground = Color.WHITE
				t.editable = false
			}


		}.setVisible(true)

	}

	public Terminal(String name)
	{
		init(name)
	}

	public Terminal(String name, def broker)
	{
		init(name)
		this.broker = broker;
	}

	static void main(String[] args)
	{
		Terminal t = new Terminal("Terminal")

		for(i in 0 .. 10000)
			t.print("asdfa")
	}
}
