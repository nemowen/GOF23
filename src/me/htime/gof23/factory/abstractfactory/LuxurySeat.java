package me.htime.gof23.factory.abstractfactory;

public class LuxurySeat implements ISeat {

	@Override
	public void material() {
		System.out.println("材质很服务，是真皮的");
	}
}
