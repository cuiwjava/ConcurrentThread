package com.cuiwjava.charptor09.method14.test;

import com.cuiwjava.charptor09.method14.myaction.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;


public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRecursiveAction action = new MyRecursiveAction();
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(action);
	}
}
