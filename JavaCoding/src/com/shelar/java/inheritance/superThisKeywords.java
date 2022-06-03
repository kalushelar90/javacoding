package com.shelar.java.inheritance;

public class superThisKeywords extends superBase{
	int a=300;
	static int b=500;
	void m3() {
		System.out.println("  i am from m3 method");
		super.m1();  
		System.out.println(super.x);
		System.out.println(this.a);	
		//super.m2();	
	}
	void m1() {//method overriding.
		System.out.println("  i am from m1 method from superThisKeywords");
	}
	
	static void m4() {
		System.out.println("  i am from m4 method");
	
	}


	public static void main(String[] args) {
		superThisKeywords obj1=new superThisKeywords();
		obj1.m1();
		obj1.m3();
	superThisKeywords.m4();
		superThisKeywords.m2();

	}

}
