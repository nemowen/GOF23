package me.htime.gof23.strategy;

public class Client {
	
	public static void main(String[] args) {
		IPriceStrategy strategy = new VipCustomerStrategy();
		PriceContent pc = new PriceContent(strategy);
		//pc.setStrategy(new SuperVipCustomerStrategy());
		pc.showDiscount(98.5);
	}

}
