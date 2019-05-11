package broker.bottom.adapters

import java.util.Map;

import broker.physical.MGLocalController;

import br.inf.ufg.mddsm.broker.adapters.Call;

import types.TypeEnum;

class SmartMeterDeviceAdapter extends DeviceAdapter {

	
	public SmartMeterDeviceAdapter() {
		/*println "smart meter"
		def th = Thread.start {
			
			while(id == null && type == null)
			{
				sleep(10000)
			}
			
			
			fail()
			
		}*/
	}
	
	private testFail()
	{
		
	}
		
	@Call(name="start", parameters=["id", "devName", "type", "properties"])
	public boolean start(String id, String name, TypeEnum type, Map properties)
	{
		Map attrs = ["id":id, "name":name, "type":type, "properties":properties]
		if(MGLocalController.startDev(attrs))
		{
			
			return true
		}
		else return false
	}
}
