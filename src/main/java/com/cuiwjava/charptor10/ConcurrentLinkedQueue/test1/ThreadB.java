package com.cuiwjava.charptor10.ConcurrentLinkedQueue.test1;

import com.cuiwjava.charptor10.ConcurrentLinkedQueue.myservice.MyService1;


public class ThreadB extends Thread {

	private MyService1 service;

	public ThreadB(MyService1 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			service.queue.add("threadB" + (i + 1));
		}
	}

}
