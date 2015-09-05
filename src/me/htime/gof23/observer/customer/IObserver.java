package me.htime.gof23.observer.customer;

/**
 * 广播接口
 * @author nemowen
 *
 */
public interface IObserver {
	void notify(SuperSubject ss);
}
