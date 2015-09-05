package me.htime.gof23.command;

import java.util.List;

/**
 * 具体的命令实体
 * @author nemowen
 *
 */
public class Command implements ICommand {
	// 这里使用了一个命令接收者
	// 在实现的项目中,可以使用多个命令接收者,可以List,Map包装
	private Receiver receiver;
	private List<Receiver> receivers;

	public Command(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	public Command(List<Receiver> receivers) {
		super();
		this.receivers = receivers;
	}

	@Override
	public void execute() {
		// before do something...
		if(null!=receiver){ // 单个接收者时
			receiver.doAction();
		}
		if(null!=receivers){// 多个接收者时
			for(Receiver c:receivers){
				c.doAction();
			}
		}
		// after do something...
	}

}
