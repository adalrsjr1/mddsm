package broker.test

import groovy.beans.Bindable
import groovy.swing.SwingBuilder

import java.awt.BorderLayout
import java.lang.reflect.*
import java.util.Map;

import javax.swing.*

import types.TypeEnum;


import broker.managers.ICentralController

class Command
{
	@Bindable String command;
	@Bindable String params;
	
	List getParams()
	{
		Method[] methods = ICentralController.class.methods
		
		Method method = methods.find {
			it.name == command
		}
		
		method.parameterTypes
		
	}
	
	List getCommandsName()
	{
		Method[] methods= ICentralController.class.methods
		
		List names = []
		
		for(m in methods)
		{
			names.add(m.name)
		}
		names
	}
}

class MiddlewareUserInterface {

	private SwingBuilder sb = new SwingBuilder()
	private def mw;

	public MiddlewareUserInterface(def mw) {
		this.mw = mw
		
		show()
	}
	
	void show()
	{
		Command command = new Command()
		
		List names = command.getCommandsName()
		def commandPanel = {
			sb.panel (constraints: BorderLayout.NORTH)
			{
				hbox{
					comboBox(id:"cbCommands", 
						items: names,
						constraints: BorderLayout.WEST,
						selectedItem: bind(target: command, targetProperty: 'command')
						)
					button(text: "execute", 
						actionPerformed:{
							mw.callMethod(command.command, command.getParams(), tfParams.text)
							
							
							//TopBroker broker = mw.mhb
							
							//Method method = broker.class.methods.find {  
							//	it.name == command.command
							//}
							//method.invoke(broker, tfParams.text)
							
							tfParams.text = ''
						}
					)
				}
			}
		}
		
		def paramsPanel = {
			sb.panel(constraints: BorderLayout.CENTER)
			{
				vbox
				{
					hbox
					{
						vbox
						{
						//label(text:bind(source: cbCommands, sourceEvent: 'itemStateChanged',
						//		sourceValue: {command.params}))
							label(text:'void start(String mgridID);')
							label(text:'void addLocalCtrlr(String id, String name, TypeEnum type, Map<String, Object> properties);')
							label(text:'void addDevice(String lc, String id, String name, TypeEnum type, Map<String, Object> properties);')
							label(text:'void requestDevProperty(String lc, String devId, String attribute);')
							label(text:'void requestCtrlrProperty(String ctrlrId, String attribute);')
							label(text:'void remDevice(String ctrlrId, String devId);')
							label(text:'void remLocalCtrlr(String ctrlrId);')
							label(text:'void setDevProperty(String ctrlrId, String devId, String attribute, Object value);')
							label(text:'void setCtrlrProperty(String ctrlrId, String attribute, Object value);')
						}
					}
					hbox
					{
						label(text: bind(source: cbCommands, sourceEvent: 'itemStateChanged',
							sourceValue: {command.command}))
							
						textField(id: 'tfParams', columns: 30)
					}
				}
			}
		}
		
		sb.frame(title:"Commands Interface",
			defaultCloseOperation:JFrame.EXIT_ON_CLOSE,
			size:[800,300],
			show:true)
		{
			lookAndFeel('system')
			commandPanel()
			paramsPanel()
		}
	}

}
