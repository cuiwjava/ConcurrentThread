package com.cuiwjava.charpter04.ThreadPoolExecutor_2_shutdownNow.test;

import com.cuiwjava.charpter04.ThreadPoolExecutor_2_shutdownNow.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
//		System.out.println("poolSize is :"+pool.getPoolSize());
//		System.out.println("getQueueSize is :"+pool.getQueue().size());

		Thread.sleep(1000);
		pool.shutdownNow();
	}
}
