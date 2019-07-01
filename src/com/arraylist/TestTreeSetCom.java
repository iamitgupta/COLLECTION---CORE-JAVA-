package com.arraylist;

import java.util.TreeSet;

public class TestTreeSetCom {

	public static void main(String[] args) {
		DescSort comparator =new DescSort();
		TreeSet ts=new TreeSet(comparator);
		
		
		ts.add("Minal");
		ts.add("Nisha");
		ts.add("Priya");
		ts.add("Sharvari");
		ts.add("Gauri");
		ts.add("Sushmi");
		ts.add("Tejali");
		ts.add("Madhuri");
		ts.add("Sayali");
		
		for(Object obj:ts) {
			System.out.println(obj);
		}
	}

}
