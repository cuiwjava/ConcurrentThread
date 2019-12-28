package com.cuiwjava.charpter03.Phaser_test6_2.test;

import java.util.concurrent.Phaser;

import com.cuiwjava.charpter03.Phaser_test6_2.extthread.*;
import com.cuiwjava.charpter03.Phaser_test6_2.service.MyService;

public class Run {

	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		MyService service = new MyService(phaser);

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

		ThreadC c = new ThreadC(service);
		c.setName("C");
		c.start();

	}

}
