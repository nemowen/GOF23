package me.htime.gof23.template_method;

public class DrawMoney extends BankTemplateMethod {

	@Override
	public void translate() {
		System.out.println("我要取钱");
	}

}
