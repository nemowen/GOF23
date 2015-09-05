package me.htime.gof23.factory.abstractfactory;

public class LowSeat implements ISeat {

	@Override
	public void material() {
		System.out.println("不舒服，气味大，硬");
	}

}
