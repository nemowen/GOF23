package me.htime.gof23.factory.factorymethod;

public class BydFactory implements ICarFatory {

	@Override
	public ICar createCar() {
		return new Byd();
	}

}
