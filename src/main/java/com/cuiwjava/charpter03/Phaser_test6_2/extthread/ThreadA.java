package com.cuiwjava.charpter03.Phaser_test6_2.extthread;


import com.cuiwjava.charpter03.Phaser_test6_2.service.MyService;

public class ThreadA extends Thread {

	private MyService myService;

	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.testMethodA();
	}

}
