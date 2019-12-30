package com.cuiwjava.charpter03.Phaser_testA.test;

import com.cuiwjava.charpter03.Phaser_testA.extthread.ThreadA;

import java.util.concurrent.Phaser;



public class Run1 {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		for (int i = 0; i < 3; i++) {
			ThreadA t = new ThreadA(phaser);
			t.start();
		}
	}
}
