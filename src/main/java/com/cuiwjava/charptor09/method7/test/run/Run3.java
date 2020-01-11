package com.cuiwjava.charptor09.method7.test.run;

import com.cuiwjava.charptor09.method7.entity.Userinfo;
import com.cuiwjava.charptor09.method7.myrunnable.MyRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;



public class Run3 {

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		Userinfo userinfo = new Userinfo();
		MyRunnable runnable = new MyRunnable(userinfo);

		ForkJoinPool pool = new ForkJoinPool();
		Future<Userinfo> future = pool.submit(runnable, userinfo);
		System.out.println(future);
		// future.get()
		// get()阻塞
		System.out.println("userinfo username=" + future.get().getUsername());
	}
}
