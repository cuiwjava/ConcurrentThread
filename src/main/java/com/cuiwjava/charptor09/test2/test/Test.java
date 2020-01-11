package com.cuiwjava.charptor09.test2.test;

import com.cuiwjava.charptor09.test2.action.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(new MyRecursiveAction(1, 10));
		Thread.sleep(5000);
	}

}
