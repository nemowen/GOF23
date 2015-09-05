package me.htime.gof23.decorator;
/**
 * Concrete Decorator 具体的装饰对象
 * @author nemowen
 *
 */
class SwimCar extends SuperCar{

	public SwimCar(ICar car) {
		super(car);
	}

	public void swimming(){
		System.out.println("车可以在水里跑了...");
	}
	
	@Override
	public void move() {
		super.move();
		swimming();
	}
	
}