package br.inf.ufg.mddsm.broker.autonomic;


import br.inf.ufg.mddsm.broker.manager.HandlingResult;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalHandler;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public class AutonomicManager implements SignalHandler {
    private Monitor monitor;
    private Analyzer analyzer;
    private Planner planner;
    private Executor executor;

    public AutonomicManager(base.AutonomicManager am, ManagerContext context) {
        monitor = new Monitor(am.getIdentifies());
        analyzer = new Analyzer(am.getRequests());
        planner = new Planner(am.getPlans());
        executor = new Executor();

        monitor.setAnalyzer(analyzer);
        analyzer.setPlanner(planner);
        planner.setExecutor(executor);

        setContext(context);
    }

    public void setContext(ManagerContext context) {
        monitor.setContext(context);
        executor.setContext(context);
    }

    public HandlingResult handle(SignalInstance signal, ManagerContext ctx) {
    	
        monitor.sense(signal);
        return HandlingResult.NOT_HANDLED;
    }

    public SignalHandler getSignalHandler() {
        return this;
    }
}
