package com.arraylist;

import java.util.Comparator;

public class DescSort implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		String s1=(String)obj1;
		
		String s2=(String)obj2;
		
		int i=s2.compareTo(s1);
		return i;
	}

}
