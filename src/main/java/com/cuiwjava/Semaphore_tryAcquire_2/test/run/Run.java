package com.cuiwjava.Semaphore_tryAcquire_2.test.run;


import com.cuiwjava.Semaphore_tryAcquire_2.extthread.*;
import com.cuiwjava.Semaphore_tryAcquire_2.service.Service;

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
