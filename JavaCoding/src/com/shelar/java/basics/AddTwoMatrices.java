package com.shelar.java.basics;

import java.util.Scanner;

//*****  Program To Add Two Matrices *****

public class AddTwoMatrices {

	private static Scanner in;

	public static void main(String[] args) {
	in = new Scanner(System.in);
	
System.out.println("Enter no of row & no of column of matrix");
	int m= in.nextInt();
	int n= in.nextInt();
	
	int first [] [] =new int [m] [n];
	int second [] [] =new int [m] [n];
	int sum [] [] =new int [m] [n];
	
	System.out.println("Enter the elements of first matrix");
		for(int c=0;c<m;c++)
			for(int d=0;d<n;d++)
				first [c] [d]= in.nextInt();
	
	
	
	System.out.println("Enterthe elements of second matrix");
				
				for(int c=0;c<m;c++)
					for(int d=0;d<n;d++)
						second [c] [d]=in.nextInt();
				
				
				for(int c=0;c<m;c++)
					for(int d=0;d<n;d++)
						
						sum [c] [d]=first [c] [d]+second [c] [d];
				
				System.out.println("sum of enterd mitrices:-");
				
				for(int c=0;c<m;c++)
					for(int d=0;d<n;d++)
						System.out.println(sum[c][d]);
				
				System.out.println();
				
	}

}

