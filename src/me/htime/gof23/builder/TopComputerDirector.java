package me.htime.gof23.builder;

public class TopComputerDirector implements IComputerDirector {
	
	private IComputerBuilder builder;
	
	TopComputerDirector(IComputerBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public Computer directComputer() {
		Monitor monitor = builder.builderMonitor();
		MainFrame mainFrame = builder.builderMainFrame();
		Keybord keybord = builder.builderbord();
		System.out.println("正在组装一台电脑");
		Computer computer = new Computer();
		computer.setMonitor(monitor);
		computer.setMainFrame(mainFrame);
		computer.setKeybord(keybord);
		return computer;
	}

}
