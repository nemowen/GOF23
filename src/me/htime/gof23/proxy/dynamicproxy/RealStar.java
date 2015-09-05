package me.htime.gof23.proxy.dynamicproxy;

/**
 * 动态代理模式实现 
 * 真实对象- 明星
 * @author nemowen
 *
 */
public class RealStar implements IStar {
	
	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
	}

	@Override
	public void singContract() {
		System.out.println("RealStar.singContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}

	@Override
	public void sing() {
		System.out.println("RealStar.sing('anglebaby is singing...')");	
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}

}
