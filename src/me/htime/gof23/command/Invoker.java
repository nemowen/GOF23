package me.htime.gof23.command;

// 命令的发起者, 命令的调用者
public class Invoker {

	// 这里可以根据业务的需求,实现多个命令
	private ICommand command;

	public Invoker(ICommand command) {
		super();
		this.command = command;
	}
	
	public void call(){
		// before do something...
		command.execute();
		// after do something...
	}
	
}
