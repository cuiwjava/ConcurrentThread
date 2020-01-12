package com.cuiwjava.charptor10.SynchronousQueueTest1.extthread;


import com.cuiwjava.charptor10.SynchronousQueueTest1.service.MyService;

public class ThreadTake extends Thread {

	private MyService service;

	public ThreadTake(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			service.takeMethod();
		}
	}
}
