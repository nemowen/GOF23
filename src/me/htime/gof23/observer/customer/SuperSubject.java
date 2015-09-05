package me.htime.gof23.observer.customer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察对象的超类
 * @author nemowen
 *
 */
public class SuperSubject {

	private List<IObserver> observers = new ArrayList<IObserver>();
	
	public void registerObserver(IObserver o){
		observers.add(o);
	}
	
	public void removeObserver(IObserver o){
		observers.remove(o);
	}
	
	public void notifyAllObserver(){
		for (IObserver iObserver : observers) {
			iObserver.notify(this);
		}
	}
}
