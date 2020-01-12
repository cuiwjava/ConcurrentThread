package com.cuiwjava.charptor10.LinkedBlockingQueueTest1.test;

import com.cuiwjava.charptor10.LinkedBlockingQueueTest1.extthread.ThreadB;
import com.cuiwjava.charptor10.LinkedBlockingQueueTest1.service.MyServiceB;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		MyServiceB service = new MyServiceB();
		for (int i = 0; i < 100; i++) {
			ThreadB a = new ThreadB(service);
			a.start();
		}
		Thread.sleep(10000);
		System.out.println(service.queue.size());
	}
}
