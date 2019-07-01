package com.arraylist;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(220);
		q.add(20);
		q.add(21);
		q.add(52);
		
		Iterator i=q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
