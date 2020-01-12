package com.cuiwjava.charptor09.method16.test.run;

import com.cuiwjava.charptor09.method16.mytask.MyRecursiveTask1;

import java.util.concurrent.ForkJoinPool;


public class Run1_1 {

	public static void main(String[] args) throws InterruptedException {
		MyRecursiveTask1 task1 = new MyRecursiveTask1();
		MyRecursiveTask1 task2 = new MyRecursiveTask1();
		MyRecursiveTask1 task3 = new MyRecursiveTask1();
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(task1);
		pool.submit(task2);
		pool.submit(task3);
		System.out.println("并行数getParallelism()=" + pool.getParallelism()
				+ "线程池大小 getPoolSize()=" + pool.getPoolSize());
		pool.shutdown();
		do {
		} while (!pool.isTerminated());
		System.out.println("main end!");
	}
}
