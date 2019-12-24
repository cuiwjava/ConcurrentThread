package com.cuiwjava.charpter01.Exchanger_1.extthread;

import java.util.concurrent.Exchanger;

public class ThreadA extends Thread {

	private Exchanger<String> exchanger;

	public ThreadA(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println("在线程A中得到线程B的值=" + exchanger.exchange("中国人A"));
			// 具有阻塞特点 次方法被调用后等待其他线程来取得数据 若无其他线程取得数据 则一直阻塞等待
			System.out.println("A end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
