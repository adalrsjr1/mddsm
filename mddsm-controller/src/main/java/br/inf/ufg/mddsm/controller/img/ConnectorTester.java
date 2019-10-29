package br.inf.ufg.mddsm.controller.img;

public class ConnectorTester {

	

	public static void main (String[] args){
		
		String server = "textr.us", db = "fiu_test", user = "fiu_test", password = "fiu_test";	
		Connector connector = new MySQLConnector();
		
		connector.connect(user, password, server, db);
		connector.getProcedureDescriptors(new DSC("Send", Type.OPER));
		connector.disconnect();
		
	}

}
