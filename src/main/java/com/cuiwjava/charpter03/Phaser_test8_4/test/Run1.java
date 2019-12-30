package com.cuiwjava.charpter03.Phaser_test8_4.test;

import com.cuiwjava.charpter03.Phaser_test8_4.extthread.ThreadA;

import java.util.concurrent.Phaser;



public class Run1 {

	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		ThreadA a = new ThreadA(phaser);
		a.setName("A");
		a.start();
	}

}
