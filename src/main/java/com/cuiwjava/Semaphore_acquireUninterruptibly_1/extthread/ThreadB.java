package com.cuiwjava.Semaphore_acquireUninterruptibly_1.extthread;


import com.cuiwjava.SemaphoreTest1.service.Service;

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