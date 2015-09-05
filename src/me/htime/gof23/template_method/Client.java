package me.htime.gof23.template_method;

public class Client {

	public static void main(String[] args) {
		new SavingMoney().process();
		
		new DrawMoney().process();
	}

}
