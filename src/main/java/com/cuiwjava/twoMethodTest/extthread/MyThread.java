package com.cuiwjava.twoMethodTest.extthread;


import com.cuiwjava.twoMethodTest.myservice.MyService;

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
