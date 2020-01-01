package com.cuiwjava.charpter04.queueDiff_big_test.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.cuiwjava.charpter04.queueDiff_big_test.myrunnable.MyRunnable;

public class ArrayBlockingQueueTest2 {

	public static void main(String[] args) throws InterruptedException {
		// ArrayBlockingQueueʹ使用代餐构造函数
		// maxֵ值呗参考
		// 队列容量不够 一个任务出现异常
		ArrayBlockingQueue array = new ArrayBlockingQueue(2);
		System.out.println(array.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, array);
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		System.out.println(pool.getPoolSize() + " " + array.size());
		// 放入队列2个任务 执行3个任务
		// 有一个任务呗拒绝
	}

}
