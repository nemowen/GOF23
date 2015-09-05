package me.htime.gof23.mediator;

public class Client {

	public static void main(String[] args) {
		
		IMediator manager = new ManagerImpl();
		
		IDepartment it = new ITDepartmentImpl(manager);
		IDepartment markit = new MarkitDepartmentImpl(manager);
		it.inAction();
		it.outAction("markit","singContract");
	}
}
