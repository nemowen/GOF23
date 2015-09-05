package me.htime.gof23.factory.factorymethod;

public class Client {

	public static void main(String[] args) {
		ICar audi = new AudiFactory().createCar();
		ICar byd = new BydFactory().createCar();
		ICar benz = new BenzFactory().createCar();
		
		audi.run();
		byd.run();
		benz.run();
	}

}
