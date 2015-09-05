package me.htime.gof23.chain_of_responsibility;

/**
 * 责任链模式,关键类
 * @author nemowen
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;
	
	public Leader(String name) {
		super();
		this.name = name;
	}

	public Leader getNextLeader() {
		return nextLeader;
	}

	// 设置上级领导
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	public abstract void handleLeaveRequest(LeaveRequest req);
	
}
