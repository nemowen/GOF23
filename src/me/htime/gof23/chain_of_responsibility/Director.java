package me.htime.gof23.chain_of_responsibility;

public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleLeaveRequest(LeaveRequest req) {
		if(null!=req){
			if(req.getLeaveDays()<3){
				System.out.println("姓名:"+req.getName()+" 请假:"+req.getLeaveDays()+"天 理由:"+req.getReason());
				System.out.println("主任:"+this.name+" 批准通过!");
			}else{
				if(null!=nextLeader){
					nextLeader.handleLeaveRequest(req);
				}
			}
		}
	}

}
