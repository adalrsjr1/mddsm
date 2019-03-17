package middleware.util;

public class CommandTokenizer {
	
	private String delims = "[(),; ]+";
	private String ldelim = "\n";
	
	public CommandTokenizer(){
		
	}
	
	public CommandTokenizer(String delims){
		this.delims = delims;
	}
	
	public String[] getCommandLines(String input){
		return input.split(ldelim);
	}
	
	public String[] getCommandParams(String input){
		return input.split(delims);
	}
	
}
