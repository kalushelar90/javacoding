package com.shelar.java.exceptionhandling;

public class MultipleCatch3 {

static int b;

	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a=" + a);
			
			int c[ ] = { 1 };
			c[42] = 99;
			b = 42 / a;
			}

			catch(ArithmeticException e) 
			{
				System.out.println("Divide by 0:"+ e);
			
			} 

			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("Array index oob:"+ e);
			}

				System.out.println("After try/catch blocks");
			}
		}