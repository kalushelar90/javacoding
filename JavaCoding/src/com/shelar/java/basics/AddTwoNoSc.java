package com.shelar.java.basics;

import java.util.Scanner;

public class AddTwoNoSc {
	
	public static void main(String[] args) {
		int x=0,y=0,sum;
		Scanner newx=new Scanner(System.in);
		System.out.println("Enter value of first no.:");
		x =newx.nextInt();
		System.out.println("Enter value of second no.:");
		y =newx.nextInt();
		
		sum=x+y;
		System.out.println("sum is:"+sum);
		
		
	}

}
