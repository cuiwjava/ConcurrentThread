package com.cuiwjava.charpter03.Phaser_test8_4.test;

import java.util.concurrent.Phaser;

import com.cuiwjava.charpter03.Phaser_test8_4.extthread.ThreadA;

public class Run2 {

	public static void main(String[] args) throws InterruptedException {
		Phaser phaser = new Phaser(3);
		ThreadA a = new ThreadA(phaser);
		a.setName("A");
		a.start();
		Thread.sleep(1000);
		phaser.arrive();
		Thread.sleep(1000);
		phaser.arrive();
		Thread.sleep(1000);
		phaser.arrive();
		System.out.println(System.currentTimeMillis());
	}

}
