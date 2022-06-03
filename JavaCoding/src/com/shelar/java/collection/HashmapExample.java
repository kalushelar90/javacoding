package com.shelar.java.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashmapExample {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, 20);
		hm.put(2, 21);
		hm.put(4, 19);
		hm.put(3, 23);
		hm.put(5, 24);
		
		
		
		System.out.println(hm.put(1, "a"));
		System.out.println(hm);
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue(20));
		System.out.println(hm.containsValue(19));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		Hashtable ht=new Hashtable();
		ht.put(1, 20);
		ht.put(7, 30);
		ht.put(3, 40);
		ht.put(4, 50);
		ht.put(6, 60);
		ht.put(2, 10);
		System.out.println(ht);
		
	}
}
