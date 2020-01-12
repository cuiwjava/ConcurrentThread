package com.cuiwjava.charptor09.method16.test.run;

import com.cuiwjava.charptor09.method16.mytask.MyRecursiveTask2;

import java.util.concurrent.ForkJoinPool;


public class Run2 {

	public static void main(String[] args) throws InterruptedException {
		MyRecursiveTask2 task = new MyRecursiveTask2(1, 900000);
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(task);
		do {
			System.out.println(" getPoolSize()=" + pool.getPoolSize()
					+ " getActiveThreadCount()=" + pool.getActiveThreadCount()
					+ " getQueuedTaskCount()=" + pool.getQueuedTaskCount()
					+ " getStealCount()=" + pool.getStealCount()
					+ " getQueuedSubmissionCount()="
					+ pool.getQueuedSubmissionCount()
					+ " getRunningThreadCount()="
					+ pool.getRunningThreadCount());
		} while (!task.isDone());
	}
}
