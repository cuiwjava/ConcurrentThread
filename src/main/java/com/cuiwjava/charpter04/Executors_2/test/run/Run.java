package com.cuiwjava.charpter04.Executors_2.test.run;

import com.cuiwjava.charpter04.Executors_2.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Run {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new MyRunnable(("" + (i + 1))));
		}

	}
}
