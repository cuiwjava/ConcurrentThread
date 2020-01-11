package com.cuiwjava.charptor09.method8.test;

import com.cuiwjava.charptor09.method8.myrunnable.MyRunnable1;

import java.util.concurrent.ForkJoinPool;


public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(myRunnable);
		Thread.sleep(1000);
		pool.shutdown();
		System.out.println("main end!");
		Thread.sleep(Integer.MAX_VALUE);
	}
}
