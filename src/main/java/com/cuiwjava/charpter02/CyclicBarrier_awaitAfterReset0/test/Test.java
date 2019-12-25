package com.cuiwjava.charpter02.CyclicBarrier_awaitAfterReset0.test;

import com.cuiwjava.charpter02.CyclicBarrier_awaitAfterReset0.extthread.ThreadA;

import java.util.concurrent.CyclicBarrier;

/**
 * 获得有几个线程已经到达平屏障点
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cbRef = new CyclicBarrier(3);

		ThreadA threadA1 = new ThreadA(cbRef);
		threadA1.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA2 = new ThreadA(cbRef);
		threadA2.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA3 = new ThreadA(cbRef);
		threadA3.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA4 = new ThreadA(cbRef);
		threadA4.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA5 = new ThreadA(cbRef);
		threadA5.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA6 = new ThreadA(cbRef);
		threadA6.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());


	}
}
