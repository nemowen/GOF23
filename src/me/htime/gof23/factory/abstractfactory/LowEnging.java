package me.htime.gof23.factory.abstractfactory;

public class LowEnging implements IEngine {

	@Override
	public void run() {
		System.out.println("性能不好，费油，跑得慢");
	}

	@Override
	public void start() {
		System.out.println("燥音大，无启停技术");
	}


}
