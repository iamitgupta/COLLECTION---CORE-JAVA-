package com.arraylist;

import java.util.Comparator;

public class EmpIdSort extends Employee  implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		EmpData e1=(EmpData)arg0;
		EmpData e2=(EmpData)arg1;
		
		int i1=e1.getId();
		int i2=e2.getId();
		
		return (i2-i1);
	}
	
}
