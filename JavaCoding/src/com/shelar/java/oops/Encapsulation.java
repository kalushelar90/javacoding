package com.shelar.java.oops;
public class Encapsulation {
	private int age;
	public void setAge(int a) {
		age=a;	
	}
	public void display() {
		System.out.println("age:"+age);
	}

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.age=20;
		obj.display();
		
	}

}
