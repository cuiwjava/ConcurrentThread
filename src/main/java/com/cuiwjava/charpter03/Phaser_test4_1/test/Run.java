package com.cuiwjava.charpter03.Phaser_test4_1.test;

import java.util.concurrent.Phaser;

public class Run {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(10);
		System.out.println(phaser.getRegisteredParties());

		phaser.bulkRegister(10);
		System.out.println(phaser.getRegisteredParties());

		phaser.bulkRegister(10);
		System.out.println(phaser.getRegisteredParties());

		phaser.bulkRegister(10);
		System.out.println(phaser.getRegisteredParties());

		phaser.bulkRegister(10);
		System.out.println(phaser.getRegisteredParties());
	}
}
