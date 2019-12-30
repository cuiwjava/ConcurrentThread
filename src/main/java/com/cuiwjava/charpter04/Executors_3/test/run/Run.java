package com.cuiwjava.charpter04.Executors_3.test.run;

import com.cuiwjava.charpter04.Executors_3.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 3; i++) {
			executorService.execute(new MyRunnable(("" + (i + 1))));
		}
		for (int i = 0; i < 3; i++) {
			executorService.execute(new MyRunnable(("" + (i + 1))));
		}

	}
}
