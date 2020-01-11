package com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_2.test.run;

import com.cuiwjava.charptor08.ScheduledThreadPoolExecutor_2.mycallable.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Run {
	public static void main(String[] args) {
		List<Runnable> runnableList = new ArrayList();
		runnableList.add(new MyRunnableA());
		runnableList.add(new MyRunnableB());
		ScheduledExecutorService executor = Executors
				.newSingleThreadScheduledExecutor();

		System.out.println("     X=" + System.currentTimeMillis());
		executor.schedule(runnableList.get(0), 0L, TimeUnit.SECONDS);
		executor.schedule(runnableList.get(1), 0L, TimeUnit.SECONDS);
		System.out.println("     Y=" + System.currentTimeMillis());

	}
}
