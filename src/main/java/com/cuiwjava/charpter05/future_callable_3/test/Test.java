package com.cuiwjava.charpter05.future_callable_3.test;

import com.cuiwjava.charpter05.future_callable_3.entity.Userinfo;
import com.cuiwjava.charpter05.future_callable_3.myrunnable.MyRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Test {

	FutureTask abc;

	public static void main(String[] args) {
		try {
			Userinfo userinfo = new Userinfo();
			MyRunnable myrunnable = new MyRunnable(userinfo);

			ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 10, 10,
					TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			Future<Userinfo> future = pool.submit(myrunnable, userinfo);
			System.out.println(future);
			System.out.println("begin time=" + System.currentTimeMillis());
			userinfo = future.get();
			System.out.println("get value " + userinfo.getUsername() + " "
					+ userinfo.getPassword());
			System.out.println("  end time=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
