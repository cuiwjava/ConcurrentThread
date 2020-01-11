package com.cuiwjava.charptor09.method6.test;

import com.cuiwjava.charptor09.method6.mycallable.MyCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;


public class Run {

	public static void main(String[] args) {
		try {
			MyCallable callable = new MyCallable();

			ForkJoinPool pool = new ForkJoinPool();
			System.out.println("begin " + System.currentTimeMillis());
			ForkJoinTask<String> returnTask = pool.submit(callable);
			System.out.println(returnTask.get());
			System.out.println("  end " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
