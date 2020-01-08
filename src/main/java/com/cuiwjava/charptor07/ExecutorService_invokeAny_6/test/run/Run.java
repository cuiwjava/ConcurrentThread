package com.cuiwjava.charptor07.ExecutorService_invokeAny_6.test.run;

import com.cuiwjava.charptor07.ExecutorService_invokeAny_6.mycallable.MyCallableA;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;



public class Run {

	public static void main(String[] args) {

		try {
			MyCallableA a = new MyCallableA();

			List callableList = new ArrayList();
			callableList.add(a);

			ExecutorService service = Executors.newCachedThreadPool();
			Object getValue = service.invokeAny(callableList, 1,
					TimeUnit.SECONDS);
			System.out.println("=============" + getValue);
			System.out.println("zzzzzzzzzzzzzzzz");
		} catch (InterruptedException e) {
			System.out.println("catch InterruptedException");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("����catch ExecutionException");
			e.printStackTrace();
		} catch (TimeoutException e) {
			System.out.println("����catch TimeoutException ��ʱ��");
			e.printStackTrace();
		}
	}
}
