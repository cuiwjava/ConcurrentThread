package com.cuiwjava.charptor10.PriorityQueueTest1.myComparator;

import com.cuiwjava.charptor10.PriorityQueueTest1.entity.Userinfo;

import java.util.Comparator;


public class MyUserinfoComparator implements Comparator<Userinfo> {

	@Override
	public int compare(Userinfo o1, Userinfo o2) {
		if (o1.getId() < o2.getId()) {
			return -1;
		}
		if (o1.getId() > o2.getId()) {
			return 1;
		}
		return 0;
	}

}
