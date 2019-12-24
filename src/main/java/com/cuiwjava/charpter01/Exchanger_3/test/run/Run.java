package com.cuiwjava.charpter01.Exchanger_3.test.run;

import com.cuiwjava.charpter01.Exchanger_3.extthread.ThreadA;

import java.util.concurrent.Exchanger;


public class Run {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		ThreadA a = new ThreadA(exchanger);
		a.start();
		System.out.println("main end!");
	}

}
