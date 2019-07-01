package com.arraylist;

import java.util.TreeSet;

public class TestTreeSetNum {

	public static void main(String[] args) {
		NumberSort comp=new NumberSort();
		TreeSet ts=new TreeSet(comp);
		
		ts.add(15);
		ts.add(30);
		ts.add(5);
		ts.add(2);
		ts.add(69);
		
		for(Object a:ts) {
			System.out.println(a);
		}
		
	}

}
