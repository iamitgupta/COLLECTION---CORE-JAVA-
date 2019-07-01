package com.arraylist;

import java.util.TreeSet;

class EmpData{
	private int id;
	private double salary;
	private String name;
	

	public  void setData(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public  int getId() {
		return id;
	}

	public  String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}

public class Employee {

	public static void main(String[] args) {

		EmpData e1,e2,e3,e4;
		e1=new EmpData();
		e2=new EmpData();
		e3=new EmpData();
		e4=new EmpData();

		e1.setData(1,"Amit",15000);
		e2.setData(9,"Sumit",5000);
		e3.setData(7,"Jeet",50000);
		e4.setData(2,"Dev",25000);

		EmpIdSort sort=new EmpIdSort();
		TreeSet ts=new TreeSet(sort);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		for(Object a:ts) {
			EmpData e=(EmpData)a;
			System.out.print("Id: "+e.getId()+" , Name: "+e.getName()+" , Salary: "+e.getSalary());
			System.out.println();

		}

	}

}
