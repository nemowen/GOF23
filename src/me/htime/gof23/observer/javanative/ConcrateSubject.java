package me.htime.gof23.observer.javanative;

import java.util.Observable;

public class ConcrateSubject extends Observable{

	int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	public void change(int s){
		this.state = s;
		setChanged();
		notifyObservers();
	}
}
