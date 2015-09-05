package me.htime.gof23.strategy;

/**
 * 策略模式 接口娄
 * 报价策略接口类
 * @author nemowen
 *
 */
public interface IPriceStrategy {
	double getPrice(double orgPrice);
}
