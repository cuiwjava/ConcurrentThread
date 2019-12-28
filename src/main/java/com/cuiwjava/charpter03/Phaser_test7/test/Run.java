package com.cuiwjava.charpter03.Phaser_test7.test;

import com.cuiwjava.charpter03.Phaser_test7.extthread.*;

import java.util.concurrent.Phaser;


public class Run {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);

		ThreadA a = new ThreadA(phaser);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(phaser);
		b.setName("B");
		b.start();

		ThreadC c = new ThreadC(phaser);
		c.setName("C");
		c.start();

		ThreadD d = new ThreadD(phaser);
		d.setName("D");
		d.start();
	}
}
