package com.cuiwjava.charpter04.queueDiff_big_test.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable;

public class LinkedBlockingDequeTest2 {

	public static void main(String[] args) throws InterruptedException {
		// LinkedBlockingDequeʹ�ô��ι���
		// maxֵ���ο�
		// ������������������һ����������쳣
		LinkedBlockingDeque linked = new LinkedBlockingDeque<Runnable>(2);
		System.out.println(linked.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, linked);
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		System.out.println(pool.getPoolSize() + " " + linked.size());
		// �ȷ������2��������ִ��3������
		// ��1�����񱻾ܾ�
	}
}
