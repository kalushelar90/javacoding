package com.shelar.java.polymorphism;

	 abstract class Anewclass {
		abstract void m1();
		 abstract void m2();
 }
	class B extends Anewclass{

		
		void m1() {
			// TODO Auto-generated method stub
			System.out.println("i m1 method");
		}

		@Override
		void m2() {
			// TODO Auto-generated method stub
			
			System.out.println("i am m2 method");
		}
	
	}

public class AbstractionEX1 {

	public static void main(String[] args) {
		Anewclass a1=new B();
		a1.m1();
		a1.m2();
	}

}
