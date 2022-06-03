package com.shelar.java.polymorphism;

	 abstract class sample {
		
	 abstract void m1(); //abstract method, method is not executed.
	
	void m2() { //Concrete method.
		
	System.out.println("concreet class");  
	
		}	
	}
class derived extends sample{

	@Override
	void m1() {
		System.out.println("I am from derived method");
		
	}
}
public class Abtraction {

	public static void main(String[] args) {
		//sample s=New sample();
		//sample is abstract class can't create object 
		derived d=new derived(); 
		sample d1=new derived();//reference of abstract with derived object//called dynamic dispatch
		d.m1();
		d.m2();
		d1.m1();
		d1.m2();
		}

	}
