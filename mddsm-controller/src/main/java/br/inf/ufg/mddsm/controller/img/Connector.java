package br.inf.ufg.mddsm.controller.img;

import java.util.ArrayList;

import br.inf.ufg.mddsm.controller.img.DSC;
import br.inf.ufg.mddsm.controller.img.ExecutionUnit;
import br.inf.ufg.mddsm.controller.img.Procedure;

public interface Connector {
	public boolean connect(String user, String password, String server, String db);
	public boolean disconnect();
	public ArrayList<Procedure> getProcedureDescriptors(DSC dsc);
	public ArrayList<ExecutionUnit> geExecutionUnits(Procedure procedure);
}