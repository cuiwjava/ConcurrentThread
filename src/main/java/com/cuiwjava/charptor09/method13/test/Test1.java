package com.cuiwjava.charptor09.method13.test;

import com.cuiwjava.charptor09.method13.myrunnable.MyRunnable1;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;


public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(myRunnable);
		System.out.println("main begin ! " + System.currentTimeMillis());
		System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));
		System.out.println("main   end ! " + System.currentTimeMillis());
		// 等待10秒 也就是阻塞10秒
	}
}
