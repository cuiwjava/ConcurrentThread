package com.cuiwjava.charptor07.ExecutorService_invokeAny_1.test.run;

import com.cuiwjava.charptor07.ExecutorService_invokeAny_1.mycallable.MyCallableA;
import com.cuiwjava.charptor07.ExecutorService_invokeAny_1.mycallable.MyCallableB1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Run1 {

	public static void main(String[] args) {
		try {
			List list = new ArrayList();
			list.add(new MyCallableA());
			list.add(new MyCallableB1());

			ExecutorService executor = Executors.newCachedThreadPool();
			// invokeAny  只取得最先完成任务的结果值
			Object getValueA = executor.invokeAny(list);
			System.out.println("============" + getValueA);
			System.out.println("ZZZZZZZZZZZZZZZZ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
