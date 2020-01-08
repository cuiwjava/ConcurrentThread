package com.cuiwjava.charptor07.test6.test;

import com.cuiwjava.charptor07.test6.mycallable.MyCallableA;
import com.cuiwjava.charptor07.test6.mycallable.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Run {

	public static void main(String[] args) {

		try {
			List list = new ArrayList();
			list.add(new MyCallableB());
			list.add(new MyCallableA());

			ExecutorService service = Executors.newCachedThreadPool();
			Object getString = service.invokeAny(list);
			System.out.println("main 取得的返回值=" + getString);
		} catch (InterruptedException e) {
			System.out.println("main Interrupted_Exception");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("main Execution_Exception");
			e.printStackTrace();
		}
	}
}
