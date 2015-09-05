package me.htime.gof23.factory.simplefactory;

public class Client {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		ICar audi = factory.createAudi();
		ICar byd = factory.createByd();
		
		audi.run();
		byd.run();
	}

}
