package com.cuiwjava.charpter04.ThreadPoolExecutor_4.test;

import com.cuiwjava.charpter04.Executors_4.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable runnable = new MyRunnable();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 99999,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		System.out.println(pool.isTerminating() + " " + pool.isTerminated());
		pool.shutdown();
		Thread.sleep(1000);
		System.out.println(pool.isTerminating() + " " + pool.isTerminated());
		Thread.sleep(1000);
		System.out.println(pool.isTerminating() + " " + pool.isTerminated());
		Thread.sleep(1000);
		System.out.println(pool.isTerminating() + " " + pool.isTerminated());
		Thread.sleep(1000);
		System.out.println(pool.isTerminating() + " " + pool.isTerminated());
		Thread.sleep(1000);
		System.out.println(pool.isTerminating() + " " + pool.isTerminated());
	}
}
