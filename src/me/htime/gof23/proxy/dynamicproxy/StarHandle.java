package me.htime.gof23.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理实现 
 * @author nemowen
 *
 */
public class StarHandle implements InvocationHandler {
	
	IStar star;

	StarHandle(IStar star) {
		this.star = star;
	}

	@Override
	public Object invoke(Object obj, Method method, Object[] arg2)
			throws Throwable {
		Object result = null;
		System.out.println("before do something....");
		if(method.getName().equals("sing")){
			result = method.invoke(star, arg2);
		}
		System.out.println("after do something....");
		return result;
	}

}
