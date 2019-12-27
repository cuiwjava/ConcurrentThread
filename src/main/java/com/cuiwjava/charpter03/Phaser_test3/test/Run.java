package com.cuiwjava.charpter03.Phaser_test3.test;

import com.cuiwjava.charpter03.Phaser_test3.extthread.ThreadA;

import java.util.concurrent.Phaser;


public class Run {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);
		ThreadA a = new ThreadA(phaser);
		a.start();
	}
}
