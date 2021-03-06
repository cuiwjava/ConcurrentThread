package com.cuiwjava.charpter03.Phaser_test1_1.test;

import com.cuiwjava.charpter03.Phaser_test1_1.extthread.ThreadA;
import com.cuiwjava.charpter03.Phaser_test1_1.extthread.ThreadB;
import com.cuiwjava.charpter03.Phaser_test1_1.extthread.ThreadC;
import com.cuiwjava.charpter03.Phaser_test1_1.tools.PrintTools;

import java.util.concurrent.Phaser;


public class Run {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		PrintTools.phaser = phaser;

		ThreadA a = new ThreadA(phaser);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(phaser);
		b.setName("B");
		b.start();

		ThreadC c = new ThreadC(phaser);
		c.setName("C");
		c.start();
	}
}
