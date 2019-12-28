package com.cuiwjava.charpter03.Phaser_test8_3.test;
import com.cuiwjava.charpter03.Phaser_test8_3.extthread.ThreadA;

import java.util.concurrent.Phaser;


public class Run {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		ThreadA a = new ThreadA(phaser);
		a.setName("A");
		a.start();
	}
}
