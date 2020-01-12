package com.cuiwjava.charptor10.ArrayBlockingQueueTest1.test;

import java.util.concurrent.ArrayBlockingQueue;

public class peek {

	public static void main(String[] args) {
		// peek:
		// ���������ǲ��Ƴ��˶��е�ͷ������˶���Ϊ�գ��򷵻� null��
		ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
		System.out.println(queue.peek());
		System.out.println(queue.offer("myString1"));
		System.out.println(queue.offer("myString2"));
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
	}
}
