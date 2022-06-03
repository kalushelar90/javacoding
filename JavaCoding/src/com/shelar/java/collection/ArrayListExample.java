package com.shelar.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList<>();
		
	  	al.add(10);
		al.add(20);
		al.add(30);
		al.add(9);
		al.add(9);
		
		Collections.sort(al);
		
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++) {
			
		System.out.println(al.get(i));	
		
		}
		
		System.out.println(al.contains(10));	
		System.out.println(al.contains(5)); 
		al.add(15);
			
		for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
		}
		System.out.println(al.lastIndexOf(15)); 
		al.remove(0);
		for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));	
			}
			
		System.out.println("______________________________________");
		//al.clear();
		for(int i=0;i<al.size();i++) {				
		System.out.println(al.get(i));	
			} 
			
		System.out.println("***************");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() );
		}
		System.out.println("_______________xxxxxxxxxx_______________________");

		ListIterator itr1=al.listIterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());	
		}
		
		System.out.println("________AAAAAAAAAAAAAAAAA_________");
	
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
			
		}
		Collections.sort(al);
		
		}
	
}

