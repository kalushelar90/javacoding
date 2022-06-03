package com.shelar.java.basics;

public class ElseIfexample {

	public static void main(String[] args) {

		int m=20;
		int a=75,b=60,c=52,d=40;
		
		if (m>=a) {
	System.out.println("First class with distinction");
		}
		else if ((m>=b)&&(m<a)) {
			System.out.println("First class");
		}
		else if ((m>=c)&&(m<b)) {
			System.out.println("second class");
		}
		else if ((m>=d)&&(m<c)) {
			System.out.println("pass class");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
