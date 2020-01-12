package com.cuiwjava.charptor10.ArrayBlockingQueueTest1.test;

import java.util.concurrent.ArrayBlockingQueue;

public class poll_1 {

	public static void main(String[] args) {
		// poll:
		// �������Ƴ��˶��е�ͷ������˶���Ϊ�գ��򷵻� null��
		ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
		System.out.println(queue.poll());
		System.out.println(queue.offer("myString1"));
		System.out.println(queue.offer("myString2"));
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.size());
	}
}
