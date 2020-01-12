package com.cuiwjava.charptor10.ConcurrentLinkedDeque.test1;

import com.cuiwjava.charptor10.ConcurrentLinkedDeque.myservice.MyService;
import com.cuiwjava.charptor10.ConcurrentLinkedDeque.extthread.*;

public class Test {

	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			ThreadA a = new ThreadA(service);
			ThreadB b = new ThreadB(service);

			a.start();
			b.start();
			a.join();
			b.join();

			System.out.println(service.queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
