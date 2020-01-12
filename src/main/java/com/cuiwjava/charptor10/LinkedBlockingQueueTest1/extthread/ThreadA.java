package com.cuiwjava.charptor10.LinkedBlockingQueueTest1.extthread;


import com.cuiwjava.charptor10.LinkedBlockingQueueTest1.service.MyServiceA;

public class ThreadA extends Thread {

	private MyServiceA service;

	public ThreadA(MyServiceA service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			service.serviceMethod();
		}
		System.out.println("z");
	}

}
