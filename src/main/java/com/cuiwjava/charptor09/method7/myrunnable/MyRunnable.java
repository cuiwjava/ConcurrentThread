package com.cuiwjava.charptor09.method7.myrunnable;


import com.cuiwjava.charptor09.method7.entity.Userinfo;

public class MyRunnable implements Runnable {

	private Userinfo userinfo;

	public MyRunnable(Userinfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	public void run() {
		try {
			userinfo.setUsername("cuiwjava");
			System.out.println("finish");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
