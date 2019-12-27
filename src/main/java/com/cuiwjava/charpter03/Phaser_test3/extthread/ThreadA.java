package com.cuiwjava.charpter03.Phaser_test3.extthread;

import java.util.concurrent.Phaser;

public class ThreadA extends Thread {

	private Phaser phaser;

	public ThreadA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		System.out.println("A  begin");
		phaser.arriveAndAwaitAdvance();
		System.out.println("A    end phase value=" + phaser.getPhase());
		// 已经到达第几个屏障
		System.out.println("A  begin");
		phaser.arriveAndAwaitAdvance();
		System.out.println("A    end phase value=" + phaser.getPhase());

		System.out.println("A  begin");
		phaser.arriveAndAwaitAdvance();
		System.out.println("A    end phase value=" + phaser.getPhase());

		System.out.println("A  begin");
		phaser.arriveAndAwaitAdvance();
		System.out.println("A    end phase value=" + phaser.getPhase());

	}

}
