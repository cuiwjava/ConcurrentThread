package com.cuiwjava.charpter01.SemaphoreTest1.etxthread;

import com.cuiwjava.charpter01.SemaphoreTest1.service.Service;

public class ThreadC extends Thread {

	private Service service;

	public ThreadC(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
