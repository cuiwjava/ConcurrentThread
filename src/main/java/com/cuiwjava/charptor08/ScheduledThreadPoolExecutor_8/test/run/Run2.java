package com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_8.test.run;


import com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_8.mycallable.MyRunnable;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Run2 {
	public static void main(String[] args) {
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
				10);
		Runnable runnable1 = new MyRunnable("A");
		executor.scheduleAtFixedRate(runnable1, 1, 2, TimeUnit.SECONDS);
		executor.setContinueExistingPeriodicTasksAfterShutdownPolicy(true);
		executor.shutdown();
		System.out.println("ִshutdown!");
	}
}
