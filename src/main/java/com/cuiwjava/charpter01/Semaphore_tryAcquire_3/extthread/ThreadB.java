package com.cuiwjava.charpter01.Semaphore_tryAcquire_3.extthread;

import com.cuiwjava.charpter01.Semaphore_tryAcquire_3.service.Service;


public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
