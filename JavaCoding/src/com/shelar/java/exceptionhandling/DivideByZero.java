package com.shelar.java.exceptionhandling;

public class DivideByZero {

	public static void main(String[] args) {
		int x=10,y=0;
		/*System.out.println("outside try.");
		
		try {
			// Risky code is written here.
			System.out.println("before exception in try:");
			System.out.println(x/y);
			System.out.println("inside try");
		}
		
		catch(ArithmeticException a)
		
		{
			System.out.println("inside catch");
			System.out.println("enter the value of y as non zero");
			a.printStackTrace();
		}*/
		
		
		try {
			int z=x/y;
			System.out.println("Value of z:"+z);
		}
		catch(ArithmeticException a) {
		
		System.out.println("end of program ");
		a.printStackTrace();
		}
	}

}
