package com.cuiwjava.Semaphore_tryAcquire_2.extthread;


import com.cuiwjava.Semaphore_tryAcquire_2.service.Service;

public class ThreadA extends Thread {

	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
