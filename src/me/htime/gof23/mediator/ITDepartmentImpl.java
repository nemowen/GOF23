package me.htime.gof23.mediator;

public class ITDepartmentImpl implements IDepartment {
	
	IMediator manager;

	public ITDepartmentImpl(IMediator manager) {
		super();
		this.manager = manager;
		manager.registor("it", this);
	}

	@Override
	public void inAction() {
		System.out.println("IT部门, 网络维护, 软件开发");
	}

	@Override
	public void outAction(String name,String action) {
		manager.commond(name,action);
	}
	

}
