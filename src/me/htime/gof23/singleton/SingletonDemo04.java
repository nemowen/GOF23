package me.htime.gof23.singleton;

/**
 * 静态内部类式
 * @author nemowen
 *
 */
public class SingletonDemo04 {
	// 只有在使用的时候才会实例化内部属性
	private static class SingletonInstance{
		private static final SingletonDemo04 instance = new SingletonDemo04();
	}

	private SingletonDemo04() {
	}
	
	public static SingletonDemo04 getInstance(){
		return SingletonInstance.instance;
	}
	
	
}
