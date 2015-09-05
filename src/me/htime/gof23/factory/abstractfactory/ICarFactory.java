package me.htime.gof23.factory.abstractfactory;

public interface ICarFactory {
	IEngine createEngine();
	ISeat createSeat();
}
