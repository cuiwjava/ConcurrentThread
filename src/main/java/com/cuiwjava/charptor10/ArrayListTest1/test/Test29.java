package com.cuiwjava.charptor10.ArrayListTest1.test;

import java.util.ArrayList;

public class Test29 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.ensureCapacity(Integer.MAX_VALUE / 300);
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < Integer.MAX_VALUE / 300; i++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - beginTime);
	}
}
