package com.Chapter7.CollectionFrameworks;

import java.util.TreeSet;
import java.util.Comparator;


class MyComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if(i1 < i2) {
			return 1;
		}else if(i1 > i2) {
			return -1;
		}
		else return 0;
	}
}

public class LearningComparatorInterface {
	public static void main(String[] args)throws Exception {
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(20);
		ts.add(40);
		ts.add(0);
		ts.add(5);
		System.out.println(ts);
	}
}

