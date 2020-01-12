package com.cuiwjava.charptor10.ConcurrentLinkedDeque.extthread;


import com.cuiwjava.charptor10.ConcurrentLinkedDeque.myservice.MyService;

public class ThreadA extends Thread {

	private MyService service;

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		while (!service.queue.isEmpty()) {
			service.queue.pollFirst();
			System.out.println(service.queue.size());
		}
	}

}
