package com.cuiwjava.charpter01.repastTest.extthread;


import com.cuiwjava.charpter01.repastTest.service.RepastService;

public class ThreadP extends Thread {

	private RepastService service;

	public ThreadP(RepastService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.set();
	}

}
