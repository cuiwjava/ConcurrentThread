package com.cuiwjava.charpter01.SemaphoreTest1.test;

import com.cuiwjava.charpter01.SemaphoreTest1.etxthread.ThreadA;
import com.cuiwjava.charpter01.SemaphoreTest1.etxthread.ThreadB;
import com.cuiwjava.charpter01.SemaphoreTest1.etxthread.ThreadC;
import com.cuiwjava.charpter01.SemaphoreTest1.service.Service;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		ThreadC c = new ThreadC(service);
		c.setName("C");
		a.start();
		b.start();
		c.start();
	}

}
