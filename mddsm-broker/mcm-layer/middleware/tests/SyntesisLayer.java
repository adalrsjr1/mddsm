package middleware.tests;

import br.inf.ufg.mddsm.broker.manager.SignalInstance;
import br.inf.ufg.mddsm.broker.model.UsesEventListener;


public class SyntesisLayer implements UsesEventListener {
	
	private MwMainManager middleware;
	
	public SyntesisLayer(){
		middleware = new MwMainManager();
		middleware.setUpListener(this);
	}
	
	public String scriptBuilder1(){
		return	"initializeMGrid(MCG001)"+"\n"+
				"addLoadController(LC001, ControllerSeasonal, 1-n, ANY, 110, 120, FALSE, LDT001)"+"\n";/*+
				"addLoadDeviceType(LDT001, SeasonalDevice, SENSITIVE, HVAC, LC001)"+"\n"+
				"addLoadDevice(LD001, LDT001, 120, CONTROLLABLE, SENSITIVE, (temp, 75))"+"\n"+
				"setDeviceProperty(LD001, critical, AJUSTABLE)"+"\n";*/
	}
	
	public String scriptBuilder2(){
		return	"initializeMGrid (MCG001)\n"+
				"addLoadController (LC001, ControllerSeasonal, 1-n, ANY, FALSE, 110, 120, LDT001)\n"+
				"addLoadDeviceType (LDT001, SeasonalDevice, SENSITIVE, HVAC, LC001)\n"+
				"addStorageController (SC001, SCT, 1-1, NEUTRAL, SDT001)\n"+
				"addStorageDeviceType (SDT001, Battery, 10.5, 12.6, SC001)\n";/*+
				"addPCCController (PCC001, PCC, 1-1, ANY, TRUE, SMT001)\n"+
				"addMeterType (SMT001, SM, PCC001)\n"+
				"addLoadDevice (LD001, LDT001, 120, CONTROLLABLE, SENSITIVE, {temp, 75})\n"+
				"addStorageDevice (SD004, SDT001, 120, 12, FALSE, NEUTRAL, {,})\n"+
				"addSmartMeter (SM001, SMT001, 0.0, 0.0)\n";
				*/
	}
	
	public Object dispatchScriptToMCM(String script){
		return middleware.dispatchScript(script);
	}
	
	@Override
	public void use(SignalInstance event) {
		System.out.println("New event in Syntesis Layer: " + event.toString());
	}
	
	public static void main(String[] args) throws InterruptedException {
		SyntesisLayer syntesis = new SyntesisLayer();
		String script = syntesis.scriptBuilder2();
		System.out.println("Call result: "+syntesis.dispatchScriptToMCM(script));
		//Thread.sleep(4000);
		//System.out.println("Call result: "+syntesis.dispatchScriptToMCM(script));
	}

}
