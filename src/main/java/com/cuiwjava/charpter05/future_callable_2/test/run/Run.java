package com.cuiwjava.charpter05.future_callable_2.test.run;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Run {

	public static void main(String[] args) {
		try {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					System.out.println("打印的信息");
				}
			};
			ExecutorService executorRef = Executors.newCachedThreadPool();
			Future future = executorRef.submit(runnable);
			System.out.println(future.get() + " " + future.isDone());
			// get() 具有阻塞性质 isDone 无阻塞
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
