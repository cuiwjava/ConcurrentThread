package com.cuiwjava.Semaphore_tryAcquire_3.test.run;


import com.cuiwjava.Semaphore_tryAcquire_3.extthread.ThreadA;
import com.cuiwjava.Semaphore_tryAcquire_3.extthread.ThreadB;
import com.cuiwjava.Semaphore_tryAcquire_3.service.Service;

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
