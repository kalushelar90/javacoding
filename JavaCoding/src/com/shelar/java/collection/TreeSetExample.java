package com.shelar.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		
		ts.add(20);
		ts.add(27);
		ts.add(23);
		ts.add(9);
		ts.add(12);
		ts.add(30);
		ts.add(12);
		
		System.out.println(ts);
		System.out.println(ts.ceiling(22));
		System.out.println(ts.floor(10));	
		System.out.println(ts.higher(27));
		System.out.println(ts.lower(20));
		ts.remove(9);
		System.out.println(ts);
		
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());   }
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(5);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
	}

}
