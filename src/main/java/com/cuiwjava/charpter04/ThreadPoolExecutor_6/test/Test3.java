package com.cuiwjava.charpter04.ThreadPoolExecutor_6.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.cuiwjava.charpter04.ThreadPoolExecutor_6.myrunnable.MyRunnable2;
import com.cuiwjava.charpter04.ThreadPoolExecutor_6.mythreadfactory.MyThreadFactoryA;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable2 myRunnable = new MyRunnable2();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.setThreadFactory(new MyThreadFactoryA());
		pool.execute(myRunnable);
	}
}
