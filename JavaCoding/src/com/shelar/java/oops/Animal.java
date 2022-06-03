package com.shelar.java.oops;

class Animal2 {
	public void eat() {
	System.out.println("I am eating");
	 }
 }
class Dog extends Animal2 {
	public void bark() {
	System.out.println("I am barking");
	 }
}
class Animal{
	public static void main(String[] args) {	
		Dog obj=new Dog();
		obj.eat();
		obj.bark();
		
	}
}
