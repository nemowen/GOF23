package me.htime.gof23.decorator;

/**
 * 需要装饰的真实对象 车
 * @author nemowen
 *
 */
class Car implements ICar{
	@Override
	public void move() {
		System.out.println("在马路上跑...");
	}
}