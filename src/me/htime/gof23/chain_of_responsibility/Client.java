package me.htime.gof23.chain_of_responsibility;

public class Client {

	public static void main(String[] args) {
		LeaveRequest req = new LeaveRequest("张三",2,"回家结婚...");
		
		Director d = new Director("李四");
		Manager m = new Manager("王五");
		GeneralManager g = new GeneralManager("丙六");
		
		d.setNextLeader(m);
		m.setNextLeader(g);
		
		d.handleLeaveRequest(req);
	}

}
