package br.inf.ufg.mddsm.broker.autonomic;

import java.util.Collection;
import base.autonomic.ChangeRequest;

public class Analyzer {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Analyzer.class);
    private Collection<ChangeRequest> requests;

    public Analyzer(Collection<ChangeRequest> requests) {
    	log.trace("new Analyzer(requests:{})", requests);
        this.requests = requests;
    }

    private Planner planner;
    public void setPlanner(Planner planner) {
    	log.trace("setPlanner(planner:{})", planner);
        this.planner = planner;
    }

    public void symptomDetected(SymptomOccurrence symptom) {
    	log.trace("symptomDetected(symptom:{})", symptom);
        for (ChangeRequest request : requests) {
            if (request.getBasedOn().equals(symptom.getSymptom())) {
                requestChange(symptom, request);
            }
        }
    }

    private void requestChange(SymptomOccurrence symptom, ChangeRequest request) {
    	log.trace("requestChange(symptom:{}, request:{})", symptom, request);
        planner.change(new ChangeRequestInstance(request, symptom));
    }

}
