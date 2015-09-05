package me.htime.gof23.factory.simplefactory;

/**
 * 简单工厂
 * @author nemowen
 *
 */
public class CarFactory {
	
	public ICar createAudi(){
		return new Audi();
	}
	
	public ICar createByd(){
		return new Byd();
	}

}
