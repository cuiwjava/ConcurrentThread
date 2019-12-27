package com.cuiwjava.charpter03.Phaser_onAdvance.test;

import com.cuiwjava.charpter03.Phaser_onAdvance.extthread.ThreadA;
import com.cuiwjava.charpter03.Phaser_onAdvance.extthread.ThreadB;
import com.cuiwjava.charpter03.Phaser_onAdvance.service.MyService;

import java.util.concurrent.Phaser;


public class Run {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(2) {
			protected boolean onAdvance(int phase, int registeredParties) {
				System.out
						.println("protected boolean onAdvance(int phase, int registeredParties)被调用！");
				return true;
				// 返回true不等待了，Phaser呈无效/销毁的状态
				// 返回false则Phaser继续工作
			}
		};

		MyService service = new MyService(phaser);

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
