package com.Chapter7.CollectionFrameworks;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
	
	String name;
	int eid;
	
	public Employee(String name , int eid) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.eid = eid;
	}
	
	public String ToString() {
		return this.name + " -- " + this.eid;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int eid1 = this.eid;
		int eid2 = ((Employee)o).eid;
		
		if(eid1 < eid2) {
			return -1;
		}else if(eid1 > eid2) {
			return 1;
		}else {
			return 0;
		}
	}
}

class MyComparator1 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}


public class ComparableAndComparatorExample {
	public static void main(String[] args) {
		Employee e1 = new Employee("Raju",100);
		Employee e2 = new Employee("Rani",101);
		Employee e3 = new Employee("Joe",102);
		Employee e4 = new Employee("Micle",103);
		Employee e5 = new Employee("Harsh",104);
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		System.out.println(ts);
		
		TreeSet<Employee> t = new TreeSet<Employee>(new MyComparator1());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
	}
}
