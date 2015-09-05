package me.htime.gof23.strategy;

/**
 * 报价策略实体类
 * 普通客户报价策略
 * @author nemowen
 *
 */
public class NormalCustomerStrategy implements IPriceStrategy {

	@Override
	public double getPrice(double orgPrice) {
		System.out.println("普通客户不打折");
		return orgPrice;
	}
}
