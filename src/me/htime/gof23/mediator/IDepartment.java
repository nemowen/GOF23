package me.htime.gof23.mediator;

public interface IDepartment {
	/**
	 * 部门内部做的事情
	 */
	void inAction();
	/**
	 * 给其他部门访问的方法
	 */
	void outAction(String name, String action);
}
