package com.cuiwjava.charptor07.test3.test;

import com.cuiwjava.charptor07.test3.mycallable.*;

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

			ExecutorService service = Executors.newCachedThreadPool();
			Object getString = service.invokeAny(list);
			System.out.println("zzzz=" + getString);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}
