package com.cuiwjava.charpter04.ThreadPoolExecutor_6.test;

import com.cuiwjava.charpter04.ThreadPoolExecutor_6.myrunnable.MyRunnable1;
import com.cuiwjava.charpter04.ThreadPoolExecutor_6.mythreadfactory.MyThreadFactoryA;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(),
				new MyThreadFactoryA());
		pool.execute(myRunnable);
	}
}
