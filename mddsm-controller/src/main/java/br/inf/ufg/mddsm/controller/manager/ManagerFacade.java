package br.inf.ufg.mddsm.controller.manager;

import java.util.Map;

public abstract class ManagerFacade {
    private MainManager manager;

    public ManagerFacade(MainManager manager) {
        this.manager = manager;
        manager.start();
    }

    public MainManager getManager() {
        return manager;
    }

    public void enqueue(String name, Map<String, Object> params) {
        getManager().enqueue(null, name, params);
    }

    public void enqueue(String name, Object... params) {
        getManager().enqueue(null, name, params);
    }
    
    public void enqueue(String name, Object source, Map<String, Object> params)
    {
    	getManager().enqueue(source, name, params);
    }
    
    public void enqueue(SignalInstance signal)
    {
    	getManager().enqueue(signal);
    }
    
    public Object execute(SignalInstance signal)
    {
    	return getManager().execute(signal);
    }
    
   /* protected void enqueue(String name, Object source, Object... params) 
    {
    	getManager().enqueue(source, name, params);
    }*/
}
