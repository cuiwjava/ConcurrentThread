package com.cuiwjava.charptor10.LinkedListTest1.test;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");

		list.addFirst("100");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
