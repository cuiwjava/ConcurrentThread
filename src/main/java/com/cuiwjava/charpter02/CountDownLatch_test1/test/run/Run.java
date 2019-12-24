package com.cuiwjava.charpter02.CountDownLatch_test1.test.run;


import com.cuiwjava.charpter02.CountDownLatch_test1.extthread.MyThread;
import com.cuiwjava.charpter02.CountDownLatch_test1.service.MyService;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThread t = new MyThread(service);
		t.start();
		Thread.sleep(2000);
		service.downMethod();
	}
}
