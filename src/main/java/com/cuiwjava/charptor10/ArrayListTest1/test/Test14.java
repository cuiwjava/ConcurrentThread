package com.cuiwjava.charptor10.ArrayListTest1.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test14 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
