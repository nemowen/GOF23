package me.htime.gof23.builder;

public class Computer {
	private Monitor monitor; 
	private MainFrame mainFrame;
	private Keybord keybord;
	
	public void launch(){
		if(null!=monitor){
			System.out.println("显示器正常启动");
		}
		if(null!=mainFrame){
			System.out.println("主机正常启动");
		}
		if(null!=mainFrame){
			System.out.println("键盘正常启动");
		}
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public MainFrame getMainFrame() {
		return mainFrame;
	}
	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	public Keybord getKeybord() {
		return keybord;
	}
	public void setKeybord(Keybord keybord) {
		this.keybord = keybord;
	}
	
}

class Monitor{
	String name;

	Monitor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class MainFrame{
	String name;

	MainFrame(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Keybord{
	String name;

	Keybord(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
