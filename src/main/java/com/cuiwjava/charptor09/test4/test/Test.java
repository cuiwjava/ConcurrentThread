package com.cuiwjava.charptor09.test4.test;

import com.cuiwjava.charptor09.test4.task.MyRecursiveTaskA;
import com.cuiwjava.charptor09.test4.task.MyRecursiveTaskB;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask<Integer> runTaskA = pool.submit(new MyRecursiveTaskA());
		ForkJoinTask<Integer> runTaskB = pool.submit(new MyRecursiveTaskB());
		System.out.println("=======" + System.currentTimeMillis());
		System.out
				.println(runTaskA.join() + " A: " + System.currentTimeMillis());
		System.out
				.println(runTaskB.join() + " B: " + System.currentTimeMillis());
		Thread.sleep(5000);
	}
}
