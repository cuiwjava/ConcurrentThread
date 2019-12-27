package com.cuiwjava.charpter02.CyclicBarrier_run4.extthread;

import com.cuiwjava.charpter02.CyclicBarrier_run4.service.MyService;

public class MyThreadC extends Thread {

	private MyService service;

	public MyThreadC(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
