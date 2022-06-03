package com.shelar.java.basics;

public class MethodEx {

	int x=20,y=30,total;
	public void addition() {
		total=x+y;
	}
	public void display() {
		System.out.println("adition of two values a & b Is:"+total);
	}
	
	public static void main(String[] args) {
		
		MethodEx obj1=new MethodEx();
		obj1.addition();
		obj1.display();

	}

}
