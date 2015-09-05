package me.htime.gof23.decorator;

/**
 * 装饰器模式：应用于，动态增加，删除功能
 * @author nemowen
 *
 */
public class Client {

	public static void main(String[] args) {
		ICar car = new Car();
		
		//SuperCar supercar = new SuperCar(car);
		//supercar.move();
		
		System.out.println("增加飞的功能------");
		ICar flycar = new FlyCar(car);
		flycar.move();
		
		System.out.println("增加水里游的功能------");
		ICar swimcar = new SwimCar(car);
		swimcar.move();
		
		System.out.println("增加水里游,天上飞的功能------");
		ICar swimFlyCar = new SwimCar(new FlyCar(new Car()));
		swimFlyCar.move();
	}
}
