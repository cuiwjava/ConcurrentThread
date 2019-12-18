package com.cuiwjava.Semaphore_acquireUninterruptibly_1.test;


import com.cuiwjava.SemaphoreTest1.etxthread.ThreadA;
import com.cuiwjava.SemaphoreTest1.etxthread.ThreadB;
import com.cuiwjava.SemaphoreTest1.service.Service;

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
