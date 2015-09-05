package me.htime.gof23.factory.abstractfactory;

/**
 * 抽象工厂，在对于创建一组产品或产品族的时候使用
 * 如以下分为，高端产品车，和低端产品车的部件生产
 * @author nemowen
 *
 */
public class Client {
	public static void main(String[] args) {
		ICarFactory luxuryCarFactory = new LuxuryFactory();
		luxuryCarFactory.createEngine().start();
		luxuryCarFactory.createSeat().material();
		
		ICarFactory lowCarFactory = new LowFactory();
		lowCarFactory.createEngine().run();
		lowCarFactory.createSeat().material();
	}
}
