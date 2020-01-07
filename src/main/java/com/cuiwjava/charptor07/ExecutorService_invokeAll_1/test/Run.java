package com.cuiwjava.charptor07.ExecutorService_invokeAll_1.test;

import com.cuiwjava.charptor07.ExecutorService_invokeAll_1.extthread.CallableA;
import com.cuiwjava.charptor07.ExecutorService_invokeAll_1.extthread.CallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Run {

	public static void main(String[] args) {

		try {
			CallableA callableA = new CallableA();
			CallableB callableB = new CallableB();

			List<Callable<String>> list = new ArrayList<Callable<String>>();
			list.add(callableA);
			list.add(callableB);

			ExecutorService service = Executors.newCachedThreadPool();
			System.out.println("invokeAll begin " + System.currentTimeMillis());
			List<Future<String>> listFuture = service.invokeAll(list);
			System.out.println("invokeAll   end " + System.currentTimeMillis());
			for (int i = 0; i < listFuture.size(); i++) {
				System.out.println("���صĽ��=" + listFuture.get(i).get() + " "
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("mainA");
		} catch (ExecutionException e) {
			e.printStackTrace();
			System.out.println("mainB");
		}

	}

}
