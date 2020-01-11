package com.cuiwjava.charptor09.join_get.mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
	@Override
	protected Integer compute() {
		System.out.println(Thread.currentThread().getName() + " ִ��compute����()");
		String nullString = null;
		nullString.toString();
		return 100;
	}
}
