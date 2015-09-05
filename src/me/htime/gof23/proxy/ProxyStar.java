package me.htime.gof23.proxy;

/**
 * 静态代理模式实现 
 * 代理类, 中介
 * @author nemowen
 *
 */
public class ProxyStar implements IStar {
	// 代理类中 持有 真实的对象 明星
	private IStar real;

	ProxyStar(IStar real) {
		super();
		this.real = real;
	}
	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void singContract() {
		System.out.println("ProxyStar.singContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	@Override
	public void sing() {
		real.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

}
