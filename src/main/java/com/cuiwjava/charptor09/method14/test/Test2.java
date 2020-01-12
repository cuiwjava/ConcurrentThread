package com.cuiwjava.charptor09.method14.test;

import com.cuiwjava.charptor09.method14.mytask.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;


public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyRecursiveTask action = new MyRecursiveTask();
		ForkJoinPool pool = new ForkJoinPool();
		String returnString = pool.invoke(action);
		System.out.println(returnString);
	}
}
