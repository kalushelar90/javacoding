package com.shelar.java.inheritance;

public class Derived extends Base{
	
	Derived(int a){
	System.out.println("I am from Derived 1 para constructor.");
	}
	Derived(){
	this(10);
	System.out.println("I am from Derived constructor.");
	}

	public static void main(String[] args) {
		
	}

	}
