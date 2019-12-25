package com.cuiwjava.charpter02.CyclicBarrier_run2.extthread;


import com.cuiwjava.charpter02.CyclicBarrier_run2.service.MyService;

public class MyThreadB extends Thread {

	private MyService service;

	public MyThreadB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
//		service.testMethod();
	}

}
