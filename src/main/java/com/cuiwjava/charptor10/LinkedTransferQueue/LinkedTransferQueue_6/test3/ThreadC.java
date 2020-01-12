package com.cuiwjava.charptor10.LinkedTransferQueue.LinkedTransferQueue_6.test3;

public class ThreadC extends Thread {

	private MyServiceC service;

	public ThreadC(MyServiceC service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " ȡ�õ�ֵ��"
					+ service.queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
