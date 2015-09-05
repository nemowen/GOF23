package me.htime.gof23.strategy;

/**
 * 报价策略实体类
 * 超级VIP客户报价策略
 * @author nemowen
 *
 */
public class SuperVipCustomerStrategy implements IPriceStrategy {

	@Override
	public double getPrice(double orgPrice) {
		System.out.println("SuperVIP客户打9折");
		return orgPrice*0.90;
	}

}
