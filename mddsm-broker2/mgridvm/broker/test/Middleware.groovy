package broker.test;


import groovy.util.logging.Log4j2

import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.BlockingQueue
import java.util.concurrent.TimeUnit

import javax.swing.*

import types.TypeEnum;


import broker.bottom.adapters.DeviceAdapter;
import broker.managers.ICentralController;
import broker.top.adapters.LocalControllerAdapter;
import broker.util.Terminal
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.model.UsesEventListener
import br.inf.ufg.mddsm.broker.state.StateHolder;
import br.inf.ufg.mddsm.broker.state.StateTypeManager;

@Log4j2
class Middleware implements UsesEventListener{
	
	private BlockingQueue<Map<String, Object>> ctrlrProperty;
	private BlockingQueue<Map<String, Object>> devProperty;
	
	public TopBroker mhb;
	
	private Terminal t = new Terminal("MHB Hierarchy")
	
	public Middleware(TopBroker broker)
	{
		mhb = broker
		ctrlrProperty = new ArrayBlockingQueue<Map<String, Object>>(100);
		devProperty = new ArrayBlockingQueue<Map<String, Object>>(100);
	}
	
	
	
	public synchronized void setRequestCtrlrProperty(SignalInstance event)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name",event.getName());
		map.put("param",event.getParams());
		map.put("source",event.getSource());
		
		try {
			ctrlrProperty.put(map);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void setRequestDevProperty(SignalInstance event)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name",event.getName());
		map.put("param",event.getParams());
		map.put("source",event.getSource());
		
		try {
			devProperty.put(map);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized Map<String,Object> getRequestDevProperty()
	{
		try {
			return devProperty.poll(100, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public synchronized Map<String,Object> getRequestCtrlrProperty()
	{
		try {
			return ctrlrProperty.poll(100, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void use(SignalInstance event)
	{
		log.info("MIDDLEWARE_RECEIVE::: ${event.toString()}")
		
		if(event.name == "ctrlrProperty")
		{
			System.out.printf("MIDDLEWARE_RECEIVE::: %s\n",event.toString());
			setRequestCtrlrProperty(event);
		}
		else if (event.name == "devProperty")
		{
			System.out.printf("MIDDLEWARE_RECEIVE::: %s\n",event.toString());
			setRequestDevProperty(event);
		}
		else if(event.name == 'ack')
		{
			
			synchronized(this)
			{
				this.notify()
			}
		} 
		else log.info(event)
	}
		
	void callMethod(String method, List args)
	{
		mhb.enqueueCalls(method, args)
	}
	
	void callMethod(String methodName, List argsType, String arg)
	{
		
		String[] args = arg.split(",")
		List params = []
		
		for(int i = 0; i < argsType.size; ++i)
		{
			def param = args[i]
			if(argsType[i].is(TypeEnum))
			{
				params[i] = TypeEnum.valueOf(param)
			}
			else if(argsType[i].is(Map))
			{
				//println "\t ${args[i]} : ${argsType[i]}"
				Map map = [:]
				param.tokenize(';').each {
					def tuple = it.tokenize(':')
					map[tuple[0]] = tuple[1].isFloat() ? tuple[1].toFloat() : tuple[1]
				}
				params[i] = map
			}
			else 
			{
				params[i] = param
			}
			
			
		}
		mhb.enqueueCalls(methodName, params)
		//mhb.invokeMethod(methodName, params)
	}	
	
	public void showHierarchy(TopBroker broker)
	{
		if(MGridVM.bench) return;
		def c = this;
		def th = Thread.start {
		
			while(true)
			{
				Thread.sleep(1000);
				t.clear()
				
				
				TopBroker tb = broker;
				StateTypeManager stm = tb.mainManager.stateManager.getType('top')
				if(stm.getAll().empty)
					continue;
				
				StateHolder sh = stm.getAll().first()
				
				Set<LocalControllerAdapter> ctrlrs = sh.getAsSet('ctrlrs')
				
				//LocalControllerAdapter ctrlr = ctrlrs.first()
				
				t.printWithoutTime "|__ ${sh.id}"
				for(ctrlr in ctrlrs)
				{
					StateTypeManager stm_lc = ctrlr.mainManager.stateManager.getType('bottom')
					StateHolder sh_lc = stm_lc.get(ctrlr.id)
					Set<DeviceAdapter> devs = sh_lc.getAsSet('devs')
					
					//println sh_lc.dump()
					t.printWithoutTime "|  |__ ${ctrlr.id} : ${sh_lc.attributes}"
					
					for(dev in devs)
					{
						t.printWithoutTime "|  |  |__ ${dev.id} : ${dev}"
					}
					
					
				}
				/*synchronized(this)
				{
					c.wait(1000)
				}*/
			}
		}
	}
	
	public static void init()
	{
		TopBroker broker = new TopBroker();
		broker.init();
		
		Middleware mw = new Middleware(broker);
		//MiddlewareUserInterface mwg = new MiddlewareUserInterface(mw)
		
		broker.setUpListener(mw);
		
		//broker.test();
		broker.islandingTest()
		
		mw.showHierarchy(broker)
	}
	
	public static void main(String[] args)
	{
		//TopBroker broker = new TopBroker();
		//broker.init();
		Middleware.init()

		
	}	
}
