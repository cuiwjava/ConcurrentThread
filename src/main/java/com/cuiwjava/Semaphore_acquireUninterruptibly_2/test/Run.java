package com.cuiwjava.Semaphore_acquireUninterruptibly_2.test;


import com.cuiwjava.Semaphore_acquireUninterruptibly_2.extthread.ThreadA;
import com.cuiwjava.Semaphore_acquireUninterruptibly_2.extthread.ThreadB;
import com.cuiwjava.Semaphore_acquireUninterruptibly_2.service.Service;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

		Thread.sleep(1000);

		b.interrupt();
		System.out.println("main中断了a");
	}

}
