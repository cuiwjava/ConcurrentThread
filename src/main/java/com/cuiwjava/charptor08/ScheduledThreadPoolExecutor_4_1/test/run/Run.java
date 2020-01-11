package com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_4_1.test.run;

import com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_4_1.mycallable.MyRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Run {
	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors
				.newSingleThreadScheduledExecutor();
		System.out.println("           X=" + System.currentTimeMillis());
		executor.scheduleAtFixedRate(new MyRunnable(), 1, 2, TimeUnit.SECONDS);
		System.out.println("           Y=" + System.currentTimeMillis());
	}
}
