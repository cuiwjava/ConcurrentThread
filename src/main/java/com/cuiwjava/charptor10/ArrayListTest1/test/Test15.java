package com.cuiwjava.charptor10.ArrayListTest1.test;

import java.util.ArrayList;

public class Test15 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("a");

		System.out.println(list.lastIndexOf("b"));

	}
}
