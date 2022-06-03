package com.shelar.java.oops;

abstract class Animal1 {
	
abstract void SoundOfAnimal(); 
}
	class Cat extends  Animal1{
	void SoundOfAnimal() {
			System.out.println("maooo");
		}
	}
	class Dog1 extends  Animal1{
		void SoundOfAnimal() {
			System.out.println("bho bho");
		}
	}

public class AbtractionEx1 {
public static void main(String[] args) {
	
		Cat C=new Cat();
		C.SoundOfAnimal();
		Dog1 D=new Dog1();
		D.SoundOfAnimal();
	}

}
