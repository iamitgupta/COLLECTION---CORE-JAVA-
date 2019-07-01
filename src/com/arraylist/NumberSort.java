package com.arraylist;

import java.util.Comparator;

public class NumberSort implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {

		int i1=(Integer)arg0;
		int i2=(Integer)arg1;
		
		return i1-i2;
		
		
	}

}
