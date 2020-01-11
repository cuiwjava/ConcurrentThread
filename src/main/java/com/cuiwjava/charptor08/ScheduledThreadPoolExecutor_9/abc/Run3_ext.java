package com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_9.abc;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_9.mycallable.MyRunnable;

public class Run3_ext {
	public static void main(String[] args) throws InterruptedException {
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
				10);
		Runnable runnable1 = new MyRunnable("A");
		ScheduledFuture future = executor.schedule(runnable1, 1,
				TimeUnit.SECONDS);
		executor.setRemoveOnCancelPolicy(true);
		System.out.println(future.cancel(true));
		System.out.println("size=" + executor.getQueue().size());
		System.out.println("main end");
	}
}
