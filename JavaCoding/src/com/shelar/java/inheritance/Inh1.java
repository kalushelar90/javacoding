package com.shelar.java.inheritance;
//this is single inheritance example.
class Animal {
	Animal(){                //constructor of animal class/base class
		System.out.println("constructor from animal class.");
	}
public void colour() {
	System.out.println("Animal colour is black");//method
	}
}
class Dog extends Animal{
	Dog(){
		System.out.println("i am constructor from DOg class.");//constructor of derived/dog class
		
	}
	public void bark() {
	System.out.println("Dog cour is black & its barking");
	}
}
public class Inh1 {
	public static void main(String[] args) {
	Dog obj=new Dog(); //for non-static method method object creation required.
	obj.bark();
	obj.colour();
	}
}
