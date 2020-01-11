package com.cuiwjava.charptor09.method3.test;

import com.cuiwjava.charptor09.method3.mytask.MyRecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;


public class Run {

	public static void main(String[] args) {
		try {
			MyRecursiveTask task = new MyRecursiveTask();
			ForkJoinPool pool = new ForkJoinPool();
			pool.execute(task);
			// execute方法返回值
			// 想取得返回值得通过
			// RecursiveTask 对象
			System.out.println(System.currentTimeMillis());
			System.out.println(task.get());
			System.out.println(System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
