package me.htime.gof23.observer.javanative;

public class Client {
public static void main(String[] args) {
	ConcrateSubject cs = new ConcrateSubject();
	
	ObserverA a = new ObserverA();
	ObserverA a1 = new ObserverA();
	ObserverA a2 = new ObserverA();
	
	cs.addObserver(a);
	cs.addObserver(a1);
	cs.addObserver(a2);
	
	cs.change(27);
	
	System.out.println("*************");
	System.out.println(a.getMyState());
	System.out.println(a1.getMyState());
	System.out.println(a2.getMyState());
}
}
