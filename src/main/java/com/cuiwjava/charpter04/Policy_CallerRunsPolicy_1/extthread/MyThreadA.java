package com.cuiwjava.charpter04.Policy_CallerRunsPolicy_1.extthread;

public class MyThreadA extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("  end " + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
