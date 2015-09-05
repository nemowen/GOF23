package me.htime.gof23.observer.javanative;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {
	
	int myState;

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

	@Override
	public void update(Observable o, Object arg) {
		this.myState = ((ConcrateSubject)o).getState();
		System.out.println("p:"+arg);
	}

}
