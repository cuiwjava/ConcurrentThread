package com.cuiwjava.charpter02.CountDownLatch_wait_long.test.run;


import com.cuiwjava.charpter02.CountDownLatch_wait_long.extthread.MyThread;
import com.cuiwjava.charpter02.CountDownLatch_wait_long.service.MyService;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThread[] threadArray = new MyThread[3];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(service);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}
	}

}
