package me.htime.gof23.strategy;

/**
 * 报价策略实体类
 * VIP客户报价策略
 * @author nemowen
 *
 */
public class VipCustomerStrategy implements IPriceStrategy {

	@Override
	public double getPrice(double orgPrice) {
		System.out.println("VIP客户打9.5折");
		return orgPrice*0.95;
	}

}
