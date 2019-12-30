package com.cuiwjava.charpter03.Phaser_testA.test;

import java.util.concurrent.Phaser;
import com.cuiwjava.charpter03.Phaser_testA.extthread.ThreadA;


public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		Phaser phaser = new Phaser(3);
		phaser.register();
		for (int i = 0; i < 3; i++) {
			ThreadA t = new ThreadA(phaser);
			t.start();
		}
		Thread.sleep(5000);
		phaser.arriveAndDeregister();
	}
}
