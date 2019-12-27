package com.cuiwjava.charpter03.Phaser_test1_1.extthread;

import com.cuiwjava.charpter03.Phaser_test1_1.tools.PrintTools;

import java.util.concurrent.Phaser;


public class ThreadA extends Thread {

	private Phaser phaser;

	public ThreadA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		PrintTools.methodA();
	}

}
