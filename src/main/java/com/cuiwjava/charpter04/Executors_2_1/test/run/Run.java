package com.cuiwjava.charpter04.Executors_2_1.test.run;

import com.cuiwjava.charpter04.Executors_2_1.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Run {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyRunnable(("" + (i + 1))));
		}
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyRunnable(("" + (i + 1))));
		}

	}
}
