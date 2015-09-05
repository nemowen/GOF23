package me.htime.gof23.mediator;

public interface IMediator {
	void registor(String name, IDepartment d);
	void commond(String name,String action);
}
