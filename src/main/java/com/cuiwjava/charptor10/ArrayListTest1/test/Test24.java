package com.cuiwjava.charptor10.ArrayListTest1.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test24 {

	public static void main(String[] args) {
		ArrayList deleteList = new ArrayList();
		deleteList.add("a");
		deleteList.add("b");
		deleteList.add("z");

		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		// 仅在此 collection 中保留指定 collection 中所包含的元素
		list.retainAll(deleteList);

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
