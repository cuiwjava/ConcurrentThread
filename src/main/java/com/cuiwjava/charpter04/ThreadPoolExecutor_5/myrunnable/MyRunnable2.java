package com.cuiwjava.charpter04.ThreadPoolExecutor_5.myrunnable;

public class MyRunnable2 implements Runnable {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
