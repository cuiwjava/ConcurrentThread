package com.cuiwjava.charpter02.CyclicBarrier_run4.test.run;


import com.cuiwjava.charpter02.CyclicBarrier_run4.extthread.*;
import com.cuiwjava.charpter02.CyclicBarrier_run4.service.MyService;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThreadA a = new MyThreadA(service);
		a.setName("A");
		MyThreadB b = new MyThreadB(service);
		b.setName("B");
		MyThreadC c = new MyThreadC(service);
		c.setName("C");

		a.start();
		b.start();
		c.start();

		Thread.sleep(2000);
		System.out.println("屏障对象的parties个数为："
				+ service.cyclicBarrier.getParties());
		System.out.println("在屏障处等待的线程个数为："
				+ service.cyclicBarrier.getNumberWaiting());

	}

}
