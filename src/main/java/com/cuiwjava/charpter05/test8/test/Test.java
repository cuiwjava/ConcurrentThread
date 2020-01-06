package com.cuiwjava.charpter05.test8.test;

import com.cuiwjava.charpter05.test8.mycallable.MyCallable;

import java.util.concurrent.*;


public class Test {

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		MyCallable callable = new MyCallable();
		ThreadPoolExecutor executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		Future<String> future = executor.submit(callable);
		System.out.println(future.cancel(true) + "   " + future.isCancelled());
		
	}
}
