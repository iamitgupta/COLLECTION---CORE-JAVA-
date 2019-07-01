package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		//adding element to array list using .add(Object);
		
		a.add(21);
		
		//adding element to array list using .add(index,Object);
		a.add(1,"Amit");
		
		//adding element to array list using .add(index,collection);
		ArrayList b=new ArrayList();
		b.add(10);
		b.add(30);
		b.add(50);
		
		a.addAll(2,b);
		
		System.out.print("Elements in list : ");
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		
		//using .get(index) method to retrieve object from list
		
		System.out.println("Element at index position 1 is "+a.get(1));
		
		//using .remove(index) method to remove  object from list at given index
		
		System.out.println(a.remove(4)+" removed successfully");
		
		
		//using .set(Index,Object) to modify value at given index
		
		a.set(1, "Gupta");
		
		
		//using .indexof(Object) to find index position of given obj
		System.out.println("index of 30 is "+a.indexOf(30));
		
		
		//using .subList(sIndex,eIndex) to create subList 
		
		List c=a.subList(0,2);
		System.out.print("Elements in list : ");
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		System.out.print("Elements in sublist : ");
		for(int i=0;i<c.size();i++) {
			System.out.print(c.get(i)+" ");
		}
		
		
		
		
		
	}

}
