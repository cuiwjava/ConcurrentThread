package com.cuiwjava.charpter04.ThreadPoolExecutor_8.test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.cuiwjava.charpter04.ThreadPoolExecutor_8.myrunnable.MyRunnable;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor pool = new ThreadPoolExecutor(4, 5, 5,
				TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		pool.allowCoreThreadTimeOut(true);
		// 是否有超时的效果
		System.out.println(pool.allowsCoreThreadTimeOut());
		for (int i = 0; i < 4; i++) {
			MyRunnable runnable = new MyRunnable();
			pool.execute(runnable);
		}
		Thread.sleep(8000);
		System.out.println(pool.getPoolSize());
	}
}
