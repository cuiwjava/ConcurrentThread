package com.cuiwjava.charpter02.CyclicBarrier_run5.extthread;

import com.cuiwjava.charpter02.CyclicBarrier_run3.service.MyService;
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
