package com.cuiwjava.charptor10.SynchronousQueueTest1.test;


import com.cuiwjava.charptor10.SynchronousQueueTest1.extthread.ThreadPut;
import com.cuiwjava.charptor10.SynchronousQueueTest1.extthread.ThreadTake;
import com.cuiwjava.charptor10.SynchronousQueueTest1.service.MyService;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();

		ThreadPut threadPut = new ThreadPut(service);
		ThreadTake threadTake = new ThreadTake(service);

		threadTake.start();
		Thread.sleep(2000);

		threadPut.start();

	}

}
