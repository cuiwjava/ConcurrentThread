package com.cuiwjava.charptor07.ExecutorService_invokeAll_2.test.run;

import com.cuiwjava.charptor07.ExecutorService_invokeAll_2.mycallable.MyCallableA;
import com.cuiwjava.charptor07.ExecutorService_invokeAll_2.mycallable.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Run {

	public static void main(String[] args) {

		try {
			List list = new ArrayList();
			list.add(new MyCallableA());
			list.add(new MyCallableB());

			ExecutorService executor = Executors.newCachedThreadPool();
			System.out.println("Y=" + System.currentTimeMillis());
			List<Future<String>> listFuture = executor.invokeAll(list);
			System.out.println("Z=" + System.currentTimeMillis());
			for (int i = 0; i < listFuture.size(); i++) {
				System.out.println("result=" + listFuture.get(i).get());
			}
			System.out.println("mainEND");
		} catch (InterruptedException e) {
			System.out.println("������InterruptedException");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("������ExecutionException");
			e.printStackTrace();
		}
	}
}
