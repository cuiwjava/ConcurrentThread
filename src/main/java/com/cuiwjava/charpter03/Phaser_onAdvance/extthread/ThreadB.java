package com.cuiwjava.charpter03.Phaser_onAdvance.extthread;


import com.cuiwjava.charpter03.Phaser_onAdvance.service.MyService;

public class ThreadB extends Thread {

	private MyService myService;

	public ThreadB(MyService myService) {
		super();
		this.myService = myService;
	}

	public void run() {
		myService.testMethod();

	}

}
