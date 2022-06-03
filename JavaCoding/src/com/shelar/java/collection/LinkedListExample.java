package com.shelar.java.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.addFirst(40);
		ll.addLast(60);
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.add(1, 5);
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		ll.add(1, "hi");
		ll.add(3, 'k');
		System.out.println(ll);
		
		
	}

}
