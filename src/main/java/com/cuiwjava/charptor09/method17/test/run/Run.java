package com.cuiwjava.charptor09.method17.test.run;

import com.cuiwjava.charptor09.method17.mytask.MyRecursiveTask1;

import java.util.concurrent.ForkJoinPool;


public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyRecursiveTask1 task11 = new MyRecursiveTask1();

		ForkJoinPool pool = new ForkJoinPool();
		System.out.println(pool.isQuiescent());
		// 是否是静止未执行状态
		pool.submit(task11);
		Thread.sleep(1000);
		System.out.println(pool.isQuiescent());
	}
}
