package com.cuiwjava.charpter01.twoMethodTest.myservice;

import java.util.concurrent.Semaphore;

public class MyService {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethod() {
		try {
			semaphore.acquire();
			// 每调用一次此方法 允许x个许可
			Thread.sleep(1000);
			System.out.println("还有大约" + semaphore.getQueueLength() + "个线程在等待");
			System.out.println("是否有线程正在等待信号量呢？" + semaphore.hasQueuedThreads());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

}
