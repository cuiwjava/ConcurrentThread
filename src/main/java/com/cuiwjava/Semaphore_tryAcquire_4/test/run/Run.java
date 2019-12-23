package com.cuiwjava.Semaphore_tryAcquire_4.test.run;

import com.cuiwjava.Semaphore_tryAcquire_4.extthread.*;
import com.cuiwjava.Semaphore_tryAcquire_4.service.Service;


public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}

}
