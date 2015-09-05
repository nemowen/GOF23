package me.htime.gof23.observer.customer;

/**
 * 被观察的对象- 目标对象
 * 可以实现不同的观察对象
 * @author nemowen
 *
 */
public class ConcrateSubject extends SuperSubject {

	private int state;
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state; // 目标对象状态发布了改变
		notifyAllObserver(); 
	}

	
}
