package com.cuiwjava.charpter04.ThreadPoolExecutor_5.test;

import com.cuiwjava.charpter04.ThreadPoolExecutor_5.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;



public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		System.out.println("main begin ! " + System.currentTimeMillis());
		System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));
		System.out.println("main   end ! " + System.currentTimeMillis());
		// ��ʵ��˵��awaitTermination()����������������
	}
}
