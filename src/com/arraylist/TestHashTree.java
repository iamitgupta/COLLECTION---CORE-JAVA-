package com.arraylist;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestHashTree {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		
		ts.add("Amit");
		ts.add("amit");
		ts.add("Manish");
		ts.add("Arbaaz");
		ts.add("Devbrat");
		
		
		
		ArrayList b=new ArrayList();
		b.add(10);
		b.add(10);
		b.add(50);
	//	b.add("Amit");
		
		TreeSet ts1=new TreeSet(b);
		
		for(Object obj:ts1) {
			System.out.println(obj);
			
		}
	}

}
