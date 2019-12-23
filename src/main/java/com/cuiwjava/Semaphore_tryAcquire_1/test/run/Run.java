package com.cuiwjava.Semaphore_tryAcquire_1.test.run;


import com.cuiwjava.Semaphore_tryAcquire_1.extthread.ThreadA;
import com.cuiwjava.Semaphore_tryAcquire_1.extthread.ThreadB;
import com.cuiwjava.Semaphore_tryAcquire_1.service.Service;

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
