package middleware.managers;

import java.util.Map;

import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.broker.manager.ManagerFacade;
import middleware.interfaces.MMainManagerInterface

/*  Welcome to kernel of Microgrid Control Middleware  */


public class MMainManager extends ManagerFacade implements MMainManagerInterface {
	
	public MMainManager(MainManager manager) {
		super(manager);
	}

	@Override
	public Object dispatchScript(String script) {
		Map params = ["script":script];
		return enqueue("DispatchScript", params);
	}

}
