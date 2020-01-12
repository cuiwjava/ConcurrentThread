package com.cuiwjava.charptor09.method14.mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<String> {

	@Override
	protected String compute() {
		return "我是返回值";
	}

}
