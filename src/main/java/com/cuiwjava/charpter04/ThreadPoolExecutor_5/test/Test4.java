package com.cuiwjava.charpter04.ThreadPoolExecutor_5.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.cuiwjava.charpter04.ThreadPoolExecutor_5.myrunnable.MyRunnable1;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.shutdown();
		System.out.println(pool.awaitTermination(Integer.MAX_VALUE,
				TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis() + " ȫ������ִ����ϣ�");
	}
}
