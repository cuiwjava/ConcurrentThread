package com.cuiwjava.charpter05.future_callable_3.myrunnable;


import com.cuiwjava.charpter05.future_callable_3.entity.Userinfo;

public class MyRunnable implements Runnable {

	private Userinfo userinfo;

	public MyRunnable(Userinfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	@Override
	public void run() {
		userinfo.setUsername("usernameValue");
		userinfo.setPassword("passwordValue");
	}
}
