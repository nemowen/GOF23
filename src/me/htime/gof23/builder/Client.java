package me.htime.gof23.builder;

/**
 * 建造者模式
 * @author nemowen
 *
 */
public class Client {

	public static void main(String[] args) {
		TopComputerDirector cpDirector = new TopComputerDirector(new TopComputerBuilder());
		Computer c = cpDirector.directComputer();
		
		c.launch();

	}

}
