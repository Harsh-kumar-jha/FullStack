package com.chapter5.OOPSPart2;

class Students implements Cloneable{
	int id;
	String name;
	static int count = 1;
	
	public Students(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [id =" + this.id + ", name ="+ this.name +" ]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return count++;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Students s = (Students) obj;
		if(this.name.equals(s.name) && this.id == s.id) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}
}

public class ObjectClassMethods {
	protected void finalized() {
		System.out.println("Called...");
	}
	public static void main(String[] args)throws Exception {
		Students s = new Students(1,"Sachin");
		Students s1 = new Students(2,"Harsh");
		Students s3 = new Students(3,"Harsh");
		Students s4 = new Students(3,"Harsh");
		
//		toString() method from Object class
		System.out.println(s);
		System.out.println(s.toString());
		
//		getClass()
		System.out.println(s.getClass().getName());
		System.out.println(s.getClass().getSuperclass());
		
//		hashCode()
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
//		equals()
		System.out.println(s.equals(s1));
		System.out.println(s3.equals(s4));
		
		String str1 = new String("Harsh");
		String str2 = new String("Harsh");
		System.out.println(str1.equals(str2));
		
		StringBuffer str3 = new StringBuffer("Harsh");
		StringBuffer str4 = new StringBuffer("Harsh");
		System.out.println(str3.equals(str4));
		
//		clone()
		
//		program without cloning(References are copied)
		Students a = new Students(1,"Sachin");
		System.out.println(a.id + " \t " + a.name);
		
		Students b = a; //Shallow cloning or partial cloning
		System.out.println(b.id + " \t " + b.name);
		
		b.id = 7;
		b.name = "Dhoni";
		System.out.println(a.id + " \t " + a.name);
		System.out.println(b.id + " \t " + b.name);
		
//		Program with cloning
		System.out.println();
		Students c = new Students(2,"Harsh");
		System.out.println(c.id + " \t " + c.name);
		Students d = (Students) c.clone(); //deep cloning
		System.out.println(d.id + " \t " + d.name);
		d.id = 18;
		d.name = "Kholi";
		System.out.println(c.id + " \t " + c.name);
		System.out.println(d.id + " \t " + d.name);
		
//		finalized()
		ObjectClassMethods o =new ObjectClassMethods();
		o = null;
		System.gc();
	}
}
