package middleware.interfaces;

import java.util.Observable;

public class ObservableMCM extends Observable {
	private String info;
	
	public ObservableMCM(){
		
	}
	
	public void stateChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setInfo(String info){
		this.info = info;
		stateChanged();
	}
	
	public String getInfo(){
		return info;
	}
	
}
