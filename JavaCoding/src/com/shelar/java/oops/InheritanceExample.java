package com.shelar.java.oops;
class Baseclass{
	int a=20,b=30;
	void displayA()
	{
		System.out.println("i am in a class:"+a);
	}
	void displayB()
	{
		System.out.println("i am in b class:"+b);
	}
}
	
class Derivedclass extends Baseclass{
		int x=40,y=50;
		void displayX()
		{
			System.out.println("I am from class X:"+x);
		}
		void displayY()
		{
			System.out.println("I am from class Y:"+y);
		}
		
}
	

public class InheritanceExample {

	public static void main(String[] args) {
		
		Derivedclass d=new Derivedclass();//ref-derived  object-derived
		Baseclass b=new Baseclass();//ref-base  object-base
	//	Derivedclass d1=new Baseclass(); // problem with costructor calling.
		Baseclass b1=new Derivedclass();//ref-base object-derived
		
		//all object from base & derived class
		d.a=500;
		d.displayA();
		d.displayB();
		d.displayX();
		d.displayY();
		
		
		//all object from base class only.
		b.a=1000;
		b.displayA();
		b.displayB();
		
		
		//base can only access.
		b1.a=5000;
		b1.displayA();
		b1.displayB();
		
		
	}
}
