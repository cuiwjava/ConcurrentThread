package com.cuiwjava.charpter02.CyclicBarrier_run2.extthread;


import com.cuiwjava.charpter02.CyclicBarrier_run2.service.MyService;

public class MyThreadA extends Thread {

	private MyService service;

	public MyThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
//		service.testMethod();
	}

}
