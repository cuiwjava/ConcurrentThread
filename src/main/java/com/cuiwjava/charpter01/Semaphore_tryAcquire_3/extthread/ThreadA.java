package com.cuiwjava.charpter01.Semaphore_tryAcquire_3.extthread;


import com.cuiwjava.charpter01.Semaphore_tryAcquire_3.service.Service;

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
