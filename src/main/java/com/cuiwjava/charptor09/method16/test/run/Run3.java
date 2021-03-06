package com.cuiwjava.charptor09.method16.test.run;

import com.cuiwjava.charptor09.method16.mytask.MyRecursiveTask3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;


public class Run3 {

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		MyRecursiveTask3 task = new MyRecursiveTask3(1, 900000);
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(task);
		do {
			System.out.println(" getActiveThreadCount()="
					+ pool.getActiveThreadCount() + " getQueuedTaskCount()="
					+ pool.getQueuedTaskCount() + " getStealCount()="
					+ pool.getStealCount() + " getQueuedSubmissionCount()="
					+ pool.getQueuedSubmissionCount()
					+ " getRunningThreadCount()="
					+ pool.getRunningThreadCount());
		} while (!task.isDone());
		System.out.println(task.get());
	}
}
