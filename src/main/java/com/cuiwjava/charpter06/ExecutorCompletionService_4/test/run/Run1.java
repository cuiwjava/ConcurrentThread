package com.cuiwjava.charpter06.ExecutorCompletionService_4.test.run;

import com.cuiwjava.charpter06.ExecutorCompletionService_4.entity.Userinfo;
import com.cuiwjava.charpter06.ExecutorCompletionService_4.myrunnable.MyRunnable;

import java.util.concurrent.*;

public class Run1 {

	public static void main(String[] args) {
		try {
			Userinfo userinfo = new Userinfo();
			MyRunnable myRunnable = new MyRunnable(userinfo);

			Executor executor = Executors.newCachedThreadPool();
			CompletionService csRef = new ExecutorCompletionService(executor);

			Future<Userinfo> future = csRef.submit(myRunnable, userinfo);
			System.out.println(future.get().getUsername() + " "
					+ future.get().getPassword());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
