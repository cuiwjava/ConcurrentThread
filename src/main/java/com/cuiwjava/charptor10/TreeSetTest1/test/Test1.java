package com.cuiwjava.charptor10.TreeSetTest1.test;

import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		// ceiling >=
		System.out.println(set.ceiling(3));
		// higher >
		System.out.println(set.higher(3));

	}

}
