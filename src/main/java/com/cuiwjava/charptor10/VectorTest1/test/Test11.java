package com.cuiwjava.charptor10.VectorTest1.test;

import java.util.Vector;

public class Test11 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("1");// 0
		vector.add("2");// 1
		vector.add("3");// 2
		vector.add("4");// 3
		vector.add("5");// 4

		vector.addElement("bottom1");
		System.out.println(vector.add("bottom2"));

		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

	}

}
