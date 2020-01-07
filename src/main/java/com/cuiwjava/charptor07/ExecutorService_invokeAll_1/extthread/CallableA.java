package com.cuiwjava.charptor07.ExecutorService_invokeAll_1.extthread;

import java.util.concurrent.Callable;

public class CallableA implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " begin "
				+ System.currentTimeMillis());
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + "   end "
				+ System.currentTimeMillis());
		return "returnA";
	}
}
