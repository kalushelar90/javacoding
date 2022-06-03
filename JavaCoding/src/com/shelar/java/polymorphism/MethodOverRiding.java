package com.shelar.java.polymorphism;

class A{
	static void m1() {
		System.out.println("i am from base class m1 method");
	}
	void m2() {
		System.out.println("i am from base class m2 method");
	}
}
class C extends A{
	static void m1() {
		System.out.println("i am from derived class m1 method");//method  hiding.
	}
	
	void m2() {
		System.out.println("i am from derived class m2 method");//method overriding.
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		
		C b1=new C();
		C.m1();
		b1.m2();
		
		
		A b2=new A();
		A.m1();
		b2.m2();
		
		A b3=new C();
	    C.m1();
		b3.m2();
		
	}

}
