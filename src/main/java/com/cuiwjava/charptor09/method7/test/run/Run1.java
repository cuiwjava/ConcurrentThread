package com.cuiwjava.charptor09.method7.test.run;

import com.cuiwjava.charptor09.method7.entity.Userinfo;
import com.cuiwjava.charptor09.method7.myrunnable.MyRunnable;

import java.util.concurrent.ForkJoinPool;


public class Run1 {

	public static void main(String[] args) throws InterruptedException {
		Userinfo userinfo = new Userinfo();
		MyRunnable runnable = new MyRunnable(userinfo);

		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(runnable, userinfo);
		// 取不到值
		System.out.println("userinfo username=" + userinfo.getUsername());
		Thread.sleep(2000);
	}
}
