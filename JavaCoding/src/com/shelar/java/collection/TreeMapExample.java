package com.shelar.java.collection;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
	
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1, "kalu");
		tm.put(2, "suraj");
		tm.put(3, "samir");
		tm.put(4, "hemant");
		tm.put(5, "kelu");
		tm.put(6, null);
		tm.put(7, "Dnyanu");
		System.out.println(tm);
	System.out.println(tm.equals(1));	
	System.out.println(tm.containsValue("kalu"));
	System.out.println(tm.lastKey());
	System.out.println(tm.size());
	System.out.println(tm.ceilingEntry(1));
	System.out.println(tm.get(6));
	System.out.println(tm.lowerKey(5));
	System.out.println(tm.higherKey(7));
		//System.out.println(tm.remove(1));
		System.out.println(tm.replace(1, "hemu"));
		System.out.println(tm);
	}

}
