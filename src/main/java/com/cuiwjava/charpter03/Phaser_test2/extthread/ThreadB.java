package com.cuiwjava.charpter03.Phaser_test2.extthread;

import java.util.concurrent.Phaser;
import com.cuiwjava.charpter03.Phaser_test2.tools.PrintTools;


public class ThreadB extends Thread {

	private Phaser phaser;

	public ThreadB(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		PrintTools.methodA();
	}

}
