package me.htime.gof23.decorator;

/**
 * Concrete Decorator 具体的装饰对象
 * @author nemowen
 *
 */
class FlyCar extends SuperCar{
	public FlyCar(ICar car) {
		super(car);
	}

	public void fly(){
		System.out.println("车在天上飞了...");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
}