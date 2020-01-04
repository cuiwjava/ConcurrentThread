package com.cuiwjava.charpter04.runnable_asynchronized_test.myrunnable;

public class MyRunnable implements Runnable {

	private String username;

	public MyRunnable(String username) {
		super();
		this.username = username;
	}

	@Override
	public void run() {
		System.out.println(username);
	}

}
