package com.cuiwjava.Semaphore_acquireUninterruptibly_2.extthread;


import com.cuiwjava.Semaphore_acquireUninterruptibly_2.service.Service;

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
