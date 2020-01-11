package com.cuiwjava.charptor09.forkjoin_3.mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {

	private int beginPosition;
	private int endPosition;

	public MyRecursiveTask(int beginPosition, int endPosition) {
		super();
		this.beginPosition = beginPosition;
		this.endPosition = endPosition;
		System.out.println("# " + (beginPosition + " " + endPosition));
	}

	protected Integer compute() {
		Integer sumValue = 0;
		System.out.println("compute=" + beginPosition + " " + endPosition);
		if ((endPosition - beginPosition) > 2) {
			System.out.println("!=0");
			int middleNum = (endPosition + beginPosition) / 2;
			System.out.println("left  传入ֵ:"
					+ (beginPosition + " " + middleNum));
			MyRecursiveTask leftTask = new MyRecursiveTask(beginPosition,
					middleNum);
			System.out.println("right 传入ֵ:"
					+ ((middleNum + 1) + " " + endPosition));
			MyRecursiveTask rightTask = new MyRecursiveTask(middleNum + 1,
					endPosition);

			this.invokeAll(leftTask, rightTask);

			Integer leftValue = leftTask.join();
			Integer rightValue = rightTask.join();

			return leftValue + rightValue;

		} else {
			int count = 0;
			for (int i = beginPosition; i <= endPosition; i++) {
				count = count + i;
			}
			return count;
		}
	}
}
