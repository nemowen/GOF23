package me.htime.gof23.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理实现 
 * @author nemowen
 *
 */
public class Client {

	public static void main(String[] args) {
		IStar real = new RealStar();
		StarHandle handle = new StarHandle(real);
		IStar proxy = (IStar)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IStar.class}, handle);
		proxy.sing();
	}

}
