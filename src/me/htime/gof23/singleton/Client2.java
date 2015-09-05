package me.htime.gof23.singleton;

import java.util.concurrent.CountDownLatch;

// 不同方式实现的单例，对照一下性能
public class Client2 {

	public static void main(String[] args) throws InterruptedException {
		
		int threadNum = 10;
		long start = System.currentTimeMillis();
		final CountDownLatch cdl = new CountDownLatch(threadNum);
		for(int i = 0; i<threadNum; i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i = 0; i<10000000; i++){
						//Object o = SingletonDemo01.getInstance();
						Object o = SingletonDemo05.INSTANCE;
						
					}
					cdl.countDown();
				}
			}).start();
		}
		cdl.await();
		long end = System.currentTimeMillis();
		
		System.out.println("耗时："+(end-start));

	}

}
