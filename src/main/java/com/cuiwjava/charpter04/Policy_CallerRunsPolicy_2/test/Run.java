package com.cuiwjava.charpter04.Policy_CallerRunsPolicy_2.test;


import com.cuiwjava.charpter04.Policy_CallerRunsPolicy_2.extthread.MyThreadA;

public class Run {

	public static void main(String[] args) {
		MyThreadA a = new MyThreadA();
		a.setName("AA");
		a.start();
		System.out.println("main end!");
	}

}
