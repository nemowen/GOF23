package me.htime.gof23.chain_of_responsibility;

public class Manager extends Leader{
	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleLeaveRequest(LeaveRequest req) {
		if(null!=req){
			if(req.getLeaveDays()<10){
				System.out.println("姓名:"+req.getName()+" 请假:"+req.getLeaveDays()+"天 理由:"+req.getReason());
				System.out.println("经理:"+this.name+" 批准通过!");
			}else{
				if(null!=nextLeader){
					nextLeader.handleLeaveRequest(req);
				}
			}
		}
	}
}
