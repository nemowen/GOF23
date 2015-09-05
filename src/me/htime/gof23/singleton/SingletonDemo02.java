package me.htime.gof23.singleton;

/**
 * 懒汉式单例
 * @author nemowen
 *
 */
public class SingletonDemo02 {
	private static SingletonDemo02 instance;

	private SingletonDemo02() {
	}
	
	public static synchronized SingletonDemo02 getInstance(){
		if(null==instance){
			instance = new SingletonDemo02();
		}
		return instance;
	}
	
	
}
