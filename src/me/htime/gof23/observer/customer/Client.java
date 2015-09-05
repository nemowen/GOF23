package me.htime.gof23.observer.customer;

public class Client {
	public static void main(String[] args) {
		ConcrateSubject cs = new ConcrateSubject();
		cs.registerObserver(new ObserverA());
		cs.registerObserver(new ObserverA());
		cs.registerObserver(new ObserverB());
		cs.registerObserver(new ObserverB());
		cs.setState(2000);
	}
	
}
