package com.shelar.java.basics;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		
		System.out.println("enter the integer to check odd or even:");
		
		Scanner in= new Scanner(System.in);
		int x=in.nextInt();
		
		if(x%2==0)
			System.out.println("You entered even no.");
		else
			System.out.println("no is not even");
	}
}
