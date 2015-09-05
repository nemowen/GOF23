package me.htime.gof23.command;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// 创建一批任务接收者
		List<Receiver> lists = new ArrayList<Receiver>();
		lists.add(new Receiver());
		lists.add(new Receiver());
		lists.add(new Receiver());
		
		ICommand command = new Command(lists);
		
		Invoker leader  = new Invoker(command);
		
		leader.call();
		
	}

}
