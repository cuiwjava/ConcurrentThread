package com.cuiwjava.charptor09.method14.myaction;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

	@Override
	protected void compute() {
		System.out.println("ThreadName=" + Thread.currentThread().getName());
	}

}
