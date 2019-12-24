package com.cuiwjava.charpter02.CountDownLatch_test2.extthread;


import com.cuiwjava.charpter02.CountDownLatch_test2.service.MyService;

public class MyThread extends Thread {

	private MyService myService;

	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.testMethod();
	}

}
