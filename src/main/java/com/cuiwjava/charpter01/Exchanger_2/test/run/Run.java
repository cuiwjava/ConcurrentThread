package com.cuiwjava.charpter01.Exchanger_2.test.run;

import com.cuiwjava.charpter01.Exchanger_2.extthread.*;

import java.util.concurrent.Exchanger;


public class Run {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		ThreadA a = new ThreadA(exchanger);
		ThreadB b = new ThreadB(exchanger);
		a.start();
		b.start();
	}

}
