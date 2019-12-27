package com.cuiwjava.charpter03.Phaser_test2.extthread;

import java.util.concurrent.Phaser;
import com.cuiwjava.charpter03.Phaser_test2.tools.PrintTools;


public class ThreadC extends Thread {

	private Phaser phaser;

	public ThreadC(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		PrintTools.methodB();
	}

}
