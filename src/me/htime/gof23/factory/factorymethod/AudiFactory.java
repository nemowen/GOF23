package me.htime.gof23.factory.factorymethod;

public class AudiFactory implements ICarFatory {

	@Override
	public ICar createCar() {
		return new Audi();
	}

}
