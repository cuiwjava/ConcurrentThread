package com.cuiwjava.charpter04.ThreadPoolExecutor_7.myrejectedexecutionhandler;

import com.cuiwjava.charpter04.ThreadPoolExecutor_7.myrunnable.MyRunnable1;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;



public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println(((MyRunnable1) r).getUsername() + " 被拒绝执行 ");
	}
}
