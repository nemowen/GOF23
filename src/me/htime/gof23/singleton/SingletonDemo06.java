package me.htime.gof23.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉式单例
 * @author nemowen
 *
 */
public class SingletonDemo06 implements Serializable {
	// 在类初始化时，立即创建对象, 天生线程安全
	private static SingletonDemo06 instance = new SingletonDemo06(); 
	
	public static SingletonDemo06 getInstance(){
		return instance;
	}
	
	private SingletonDemo06() {
		// 防止破解单例模式
		if(null!=instance){
			throw new RuntimeException("已经存在实例，不能再创建对象");
		}
	}
	
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}

}
