package com.cuiwjava.charptor09.forkjoin_2.test.run;

import com.cuiwjava.charptor09.forkjoin_2.mytask.MyRecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;


public class Run {

	public static void main(String[] args) throws InterruptedException {
		try {
			MyRecursiveTask task = new MyRecursiveTask(1, 10);
			ForkJoinPool pool = new ForkJoinPool();
			pool.submit(task);
			System.out.println("���ֵΪ��" + task.get());
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
