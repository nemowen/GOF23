package me.htime.gof23.mediator;

public class MarkitDepartmentImpl implements IDepartment {
	
	IMediator manager;

	public MarkitDepartmentImpl(IMediator manager) {
		super();
		this.manager = manager;
		manager.registor("markit", this);
	}

	@Override
	public void inAction() {
		System.out.println("为公司接项目,并推消软件产品");
	}

	@Override
	public void outAction(String name,String action) {
		manager.commond(name,action);
	}
	
	public void singContract(){
		System.out.println("市场部,跟客户签合同");
	}

}
