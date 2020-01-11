package com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_7.test.run;

import com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_7.mycallable.MyRunnable;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Run2 {
	public static void main(String[] args) {
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
				1);
		Runnable runnable1 = new MyRunnable("A");
		Runnable runnable2 = new MyRunnable("B");
		executor.schedule(runnable1, 3, TimeUnit.SECONDS);
		executor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
		executor.shutdown();
		System.out.println("已经shutdown了");
	}
}
