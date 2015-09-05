package me.htime.gof23.factory.abstractfactory;

public class LuxuryFactory implements ICarFactory {

	@Override
	public IEngine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public ISeat createSeat() {
		return new LuxurySeat();
	}

}
