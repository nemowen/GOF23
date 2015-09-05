package me.htime.gof23.strategy;

/*
 * 报价策略上下文, 重要
 */
public class PriceContent {
	
	// 在使用时,可以动态注入报价策略实体
	private IPriceStrategy strategy;

	public PriceContent() {
		super();
	}

	public PriceContent(IPriceStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(IPriceStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void showDiscount(double orgPrice){
		System.out.println("您的报价为:"+strategy.getPrice(orgPrice));
	}
	

}
