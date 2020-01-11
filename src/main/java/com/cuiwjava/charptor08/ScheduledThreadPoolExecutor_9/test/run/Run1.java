package com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_9.test.run;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_9.mycallable.MyRunnable;

public class Run1 {
	public static void main(String[] args) throws InterruptedException {
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
				10);
		Runnable runnable1 = new MyRunnable("A");
		ScheduledFuture future = executor.schedule(runnable1, 1,
				TimeUnit.SECONDS);
		System.out.println(future.cancel(true));
		Thread.sleep(500);
		BlockingQueue<Runnable> queue = executor.getQueue();
		Iterator<Runnable> iterator = queue.iterator();
		while (iterator.hasNext()) {
			Runnable runnable = (Runnable) iterator.next();
			System.out.println("队列中的" + runnable);
		}
		System.out.println("main end!");
	}
}
