package com.cuiwjava.charptor09.method13.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import com.cuiwjava.charptor09.method13.myrunnable.*;



public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable2 myRunnable = new MyRunnable2();
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(myRunnable);
		pool.shutdown();
		System.out.println("A=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("B=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
	}
}
