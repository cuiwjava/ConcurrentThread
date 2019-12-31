package com.cuiwjava.charpter04.ThreadPoolExecutor_2.test;

import com.cuiwjava.charpter04.ThreadPoolExecutor_2.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(7, 10, 0L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		System.out.println("main end!");
	}
}
