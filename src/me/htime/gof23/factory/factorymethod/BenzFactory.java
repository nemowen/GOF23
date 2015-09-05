package me.htime.gof23.factory.factorymethod;

public class BenzFactory implements ICarFatory {

	@Override
	public ICar createCar() {
		return new Benz();
	}

}
