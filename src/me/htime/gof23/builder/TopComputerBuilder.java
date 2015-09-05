package me.htime.gof23.builder;

public class TopComputerBuilder implements IComputerBuilder {

	@Override
	public Monitor builderMonitor() {
		System.out.println("生产一台显示器");
		return new Monitor("ViewSonic显示器");
	}

	@Override
	public MainFrame builderMainFrame() {
		System.out.println("生产一台华硕主机");
		return new MainFrame("华硕主机");
	}

	@Override
	public Keybord builderbord() {
		System.out.println("生产一台雨燕键盘");
		return new Keybord("雨燕键盘");
	}

}
