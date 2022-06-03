package com.shelar.java.exceptionhandling;

public class throw1 {

	public static void main(String[] args) {
		int x=10,y=0;
	    int z=x/y;
		System.out.println("Value of z:"+z);
		throw new ArithmeticException("I have thrown this expression");
	}

}
