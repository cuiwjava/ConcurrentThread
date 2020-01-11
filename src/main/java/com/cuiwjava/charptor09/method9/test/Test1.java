package com.cuiwjava.charptor09.method9.test;

import java.util.concurrent.ForkJoinPool;

import com.cuiwjava.charptor09.method9.myrunnable.MyRunnable1;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(myRunnable);
		Thread.sleep(2000);
		pool.shutdownNow();
		pool.submit(myRunnable);
	}
}
