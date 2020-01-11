package com.cuiwjava.charptor09.test2.action;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

	private int beginValue;
	private int endValue;

	public MyRecursiveAction(int beginValue, int endValue) {
		super();
		this.beginValue = beginValue;
		this.endValue = endValue;
	}

	@Override
	protected void compute() {
		System.out.println(Thread.currentThread().getName() + " -------");
		if (endValue - beginValue > 2) {
			int middelNum = (beginValue + endValue) / 2;
			System.out.println(beginValue + " and "+ endValue + "  middelNum: "+middelNum);
			MyRecursiveAction leftAction = new MyRecursiveAction(beginValue,
					middelNum);
			MyRecursiveAction rightAction = new MyRecursiveAction(
					middelNum + 1, endValue);
			this.invokeAll(leftAction, rightAction);
		} else {
			System.out.println("打印组合" + beginValue + "-" + endValue);
		}

	}
}
