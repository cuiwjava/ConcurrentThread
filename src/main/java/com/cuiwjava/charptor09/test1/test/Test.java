package com.cuiwjava.charptor09.test1.test;

import com.cuiwjava.charptor09.test1.action.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(new MyRecursiveAction());
		Thread.sleep(5000);
	}

}
