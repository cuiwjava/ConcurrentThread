package com.cuiwjava.charpter01.SemaphoreTest2.test;

import com.cuiwjava.charpter01.SemaphoreTest2.extthread.*;
import com.cuiwjava.charpter01.SemaphoreTest2.service.Service;

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
