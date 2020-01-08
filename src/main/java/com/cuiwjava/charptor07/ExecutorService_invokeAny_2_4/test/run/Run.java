package com.cuiwjava.charptor07.ExecutorService_invokeAny_2_4.test.run;

import com.cuiwjava.charptor07.ExecutorService_invokeAny_2_4.mycallable.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Run {

	public static void main(String[] args) {
		try {
			List list = new ArrayList();
			list.add(new MyCallableA());
			list.add(new MyCallableB());

			ExecutorService executor = Executors.newCachedThreadPool();
			System.out.println(executor);
			String getValueA = executor.invokeAny(list);
			System.out.println("����ֵ" + getValueA);
			System.out.println("mainEND");
		} catch (InterruptedException e) {
			System.out.println("����catch InterruptedException");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("����catch ExecutionException");
			e.printStackTrace();
		}

	}
}
