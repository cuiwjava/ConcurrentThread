package com.cuiwjava.drainPermitsTest.myservice;

import java.util.concurrent.Semaphore;

public class MyService {

	private Semaphore semaphore = new Semaphore(10);

	public void testMethod() {
		try {
			semaphore.acquire();
			System.out.println(semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + " "
					+ semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + " "
					+ semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + " "
					+ semaphore.availablePermits());
			// drainPermits 获取并返回立即可用的所有许可个数,并且将可用许可置0
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

}
