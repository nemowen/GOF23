package me.htime.gof23.decorator;

/**
 * 装饰器 Decorator 装饰角色
 * @author nemowen
 *
 */
class SuperCar implements ICar{
	// 持有对真实对象的引用
	ICar car;
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
	}
}