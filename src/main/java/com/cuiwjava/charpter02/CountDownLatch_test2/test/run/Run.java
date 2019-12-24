package com.cuiwjava.charpter02.CountDownLatch_test2.test.run;


import com.cuiwjava.charpter02.CountDownLatch_test2.extthread.MyThread;
import com.cuiwjava.charpter02.CountDownLatch_test2.service.MyService;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThread[] tArray = new MyThread[10];
		for (int i = 0; i < tArray.length; i++) {
			tArray[i] = new MyThread(service);
			tArray[i].setName("线程" + (i + 1));
			tArray[i].start();
		}
		Thread.sleep(2000);
		service.downMethod();
	}
}
