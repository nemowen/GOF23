package me.htime.gof23.factory.abstractfactory;

public class LuxuryEngine implements IEngine {

	@Override
	public void run() {
		System.out.println("性能好，跑得很快");
	}

	@Override
	public void start() {
		System.out.println("启动快，无声，有启停技术");
	}

}
