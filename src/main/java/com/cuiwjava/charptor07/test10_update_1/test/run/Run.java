package com.cuiwjava.charptor07.test10_update_1.test.run;

import com.cuiwjava.charptor07.test10_update_1.mycallable.MyCallableA;
import com.cuiwjava.charptor07.test10_update_1.mycallable.MyCallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class Run {

	public static void main(String[] args) {

		try {
			MyCallableA a = new MyCallableA();
			MyCallableB b = new MyCallableB();

			List callableList = new ArrayList();
			callableList.add(a);
			callableList.add(b);

			ExecutorService service = Executors.newCachedThreadPool();
			System.out.println("X " + System.currentTimeMillis());
			List<Future<String>> listFuture = service.invokeAll(callableList,
					2, TimeUnit.SECONDS);
			System.out.println("Y " + System.currentTimeMillis());
			for (int i = 0; i < listFuture.size(); i++) {
//				Thread.sleep(1000);
				System.out.println("for 第" + (i + 1) + "次循环");
				System.out.println(listFuture.get(i).get());
			}
			System.out.println("Z " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			System.out.println(" 进入catch InterruptedException");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println(" 进入catch ExecutionException");
			e.printStackTrace();
		}
	}
}
