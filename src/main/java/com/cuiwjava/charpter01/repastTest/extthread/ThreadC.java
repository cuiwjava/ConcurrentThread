package com.cuiwjava.charpter01.repastTest.extthread;


import com.cuiwjava.charpter01.repastTest.service.RepastService;

public class ThreadC extends Thread {

	private RepastService service;

	public ThreadC(RepastService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.get();
	}

}
