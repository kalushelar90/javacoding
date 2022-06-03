package com.shelar.java.basics;

import java.util.Scanner;

// This program is written to Divide Two Numbers.

public class DivTwoNumber {
	public static void main(String[] args) {
	/*int a=30,b=10,div;
		div=a/b;
		System.out.println("Division of a & b is:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(div);	*/
		float div;
	
		System.out.println("Addition of two nos");
		
		Scanner obj=new Scanner(System.in);
		
		
		System.out.println("enter first no:");
		
		int a1=obj.nextInt();
		
		System.out.println("enter second  no:");
		
		int b1=obj.nextInt();
		
		div=a1/b1;
		System.out.println("division is:"+div);
		
	}
}
