package com.cuiwjava.Semaphore_MoreToOne_2.extthread;

import com.cuiwjava.Semaphore_MoreToOne_1.service.Service;

public class MyThread extends Thread {

	private Service service;

	public MyThread(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.sayHello();
	}

}
