package com.cuiwjava.charpter06.ExecutorCompletionService_errorHandle.test.run;

import java.util.concurrent.CompletionService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

import com.cuiwjava.charpter06.ExecutorCompletionService_errorHandle.mycallable.MyCallableA;
import com.cuiwjava.charpter06.ExecutorCompletionService_errorHandle.mycallable.MyCallableB;


public class Run4 {

	public static void main(String[] args) {
		try {
			MyCallableA callableA = new MyCallableA();
			MyCallableB callableB = new MyCallableB();

			Executor executor = Executors.newSingleThreadExecutor();
			CompletionService csRef = new ExecutorCompletionService(executor);
			csRef.submit(callableA);
			csRef.submit(callableB);

			for (int i = 0; i < 2; i++) {
				System.out.println("zzzzzzzzzzzz" + " " + csRef.poll());
			}
			Thread.sleep(6000);
			System.out.println("A��" + " " + csRef.poll());
			System.out.println("B��" + " " + csRef.poll());
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
