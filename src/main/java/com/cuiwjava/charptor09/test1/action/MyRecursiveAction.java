package com.cuiwjava.charptor09.test1.action;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

	@Override
	protected void compute() {
		System.out.println("compute run!");
	}

}
