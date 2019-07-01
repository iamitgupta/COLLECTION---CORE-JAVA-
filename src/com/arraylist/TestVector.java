package com.arraylist;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		Object obj=new Object();
		
		v.add(10);
		v.add("Amit");
		v.add(true);
		v.add('c');
		
		v.add(obj);
		
		
		System.out.println(v);
		
		
	}

}
