package br.inf.ufg.mddsm.broker.autonomic;


import br.inf.ufg.mddsm.broker.manager.HandlingResult;
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalHandler;
import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public class AutonomicManager implements SignalHandler {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AutonomicManager.class);
    private Monitor monitor;
    private Analyzer analyzer;
    private Planner planner;
    private Executor executor;

    public AutonomicManager(base.AutonomicManager am, ManagerContext context) {
    	log.trace("new AutonomicManager(am:{}, context:{}", am, context);
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
    	log.trace("setContext(context:{}", context);
        monitor.setContext(context);
        executor.setContext(context);
    }

    public HandlingResult handle(SignalInstance signal, ManagerContext ctx) {
    	log.trace("handle(signal:{}, ctx:{}", signal, ctx);
        monitor.sense(signal);
        log.trace("handle() = {}", HandlingResult.NOT_HANDLED);
        return HandlingResult.NOT_HANDLED;
    }

    public SignalHandler getSignalHandler() {
    	log.trace("getSignalHandler() = {}", this);
        return this;
    }
}
