package com.cuiwjava.charptor10.LinkedBlockingDequeTest1.test;

import java.util.concurrent.LinkedBlockingDeque;

public class pop_1 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
		deque.addFirst("anyString1");
		deque.addFirst("anyString2");
		deque.addFirst("anyString3");
		System.out.println(deque.pop());
		System.out.println(deque.size());
	}

}
