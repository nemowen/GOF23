package me.htime.gof23.singleton;

/**
 * 饿汉式单例
 * @author nemowen
 *
 */
public class SingletonDemo01 {
	// 在类初始化时，立即创建对象, 天生线程安全
	private static SingletonDemo01 instance = new SingletonDemo01(); 
	
	public static SingletonDemo01 getInstance(){
		return instance;
	}
	
	private SingletonDemo01() {}

}
