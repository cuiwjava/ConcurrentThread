package com.cuiwjava.charpter04.queueDiff_big_test.test;

import com.cuiwjava.charpter04.queueDiff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class SynchronousQueueTest1 {

	public static void main(String[] args) throws InterruptedException {
		SynchronousQueue linked = new SynchronousQueue<Runnable>();
		System.out.println(linked.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, linked);
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		System.out.println(pool.getPoolSize() + " " + linked.size());
		// ֱ��ִ��3������
	}
}
