// for static method single inheritance and static method object creation not required.
package com.shelar.java.inheritance;

class Animal1{
	 static void eat() {       //static method 
		System.out.println("animal is eating");
	}
}
class Dog1 extends Animal1{
	 static void bark() {     //static method
		System.out.println("Dog is barking");
	}
}

public class Inh2 {

	public static void main(String[] args) {
		Animal1.eat();  // no object creation required for static method.
		Dog1.bark();	//classname.method();
	}

}
