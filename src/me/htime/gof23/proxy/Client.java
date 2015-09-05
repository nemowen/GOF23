package me.htime.gof23.proxy;

/**
 * 静态代理模式实现 
 * @author nemowen
 *
 */
public class Client {

	public static void main(String[] args) {
		IStar real = new RealStar();
		IStar proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.singContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.collectMoney();

	}

}
