package com.cuiwjava.charptor09.join_get.test;

import com.cuiwjava.charptor09.test3.mytask.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;


public class Test2 {

	public static void main(String[] args) {
		MyRecursiveTask task1 = new MyRecursiveTask();
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask task2 = pool.submit(task1);
		System.out.println(task2.join());
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String newString = new String();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
		}
		System.out.println("main end");
	}

}