package com.cuiwjava.charpter05.future_callable_4.mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return "我的年龄是100";
	}

}
