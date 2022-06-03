package com.shelar.java.exceptionhandling;

public class TRyCatch2 {

	public static void main(String[] args) {
		int a=10,b=5,c=5,d;
		
		
		try {
		d=a/(b-c);
		int x[]=new int[5];
		x[10]=50;
		System.out.println(d);
		}
		catch (ArrayIndexOutOfBoundsException m) {
			System.out.println("i am here");
			m.printStackTrace();
		}
		catch (ArithmeticException n) {
			System.out.println("this wil be not printed.");
			n.printStackTrace();
			}
	}
}
