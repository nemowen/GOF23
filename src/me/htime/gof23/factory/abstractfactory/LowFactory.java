package me.htime.gof23.factory.abstractfactory;

public class LowFactory implements ICarFactory {

	@Override
	public IEngine createEngine() {
		return new LowEnging();
	}

	@Override
	public ISeat createSeat() {
		return new LowSeat();
	}

}
