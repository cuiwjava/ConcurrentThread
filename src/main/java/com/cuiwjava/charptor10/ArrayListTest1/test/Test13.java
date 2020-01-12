package com.cuiwjava.charptor10.ArrayListTest1.test;

import java.util.ArrayList;

public class Test13 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list.size() + " " + list.isEmpty());
		list.clear();
		System.out.println(list.size() + " " + list.isEmpty());
	}
}
