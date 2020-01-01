package com.cuiwjava.charpter04.ThreadPoolExecutor_5.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.cuiwjava.charpter04.ThreadPoolExecutor_5.myrunnable.MyRunnable2;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable2 myRunnable = new MyRunnable2();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 99999, 9999L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.shutdown();
		System.out.println("A=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		//池中有线程在执行 则阻塞指定时间
		System.out.println("B=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("C=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("D=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("E=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("F=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("G=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());

	}
}
