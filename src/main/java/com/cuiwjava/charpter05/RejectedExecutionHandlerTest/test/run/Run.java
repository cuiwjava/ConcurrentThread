package com.cuiwjava.charpter05.RejectedExecutionHandlerTest.test.run;

import com.cuiwjava.charpter05.RejectedExecutionHandlerTest.executionhandler.MyRejectedExecutionHandler;
import com.cuiwjava.charpter05.RejectedExecutionHandlerTest.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class Run {

	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();
		ThreadPoolExecutor executor = (ThreadPoolExecutor) service;
		executor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
		service.submit(new MyRunnable("A"));
		service.submit(new MyRunnable("B"));
		service.submit(new MyRunnable("C"));
		executor.shutdown();
		service.submit(new MyRunnable("D"));

	}

}
