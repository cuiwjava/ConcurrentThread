package com.cuiwjava.charpter04.queueDiff_big_test.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable;

public class ArrayBlockingQueueTest2 {

	public static void main(String[] args) throws InterruptedException {
		// ArrayBlockingQueueʹ�ô��ι���
		// maxֵ���ο�
		// ������������������һ����������쳣
		ArrayBlockingQueue array = new ArrayBlockingQueue(2);
		System.out.println(array.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, array);
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		System.out.println(pool.getPoolSize() + " " + array.size());
		// �ȷ������2��������ִ��3������
		// ��1�����񱻾ܾ�
	}

}
