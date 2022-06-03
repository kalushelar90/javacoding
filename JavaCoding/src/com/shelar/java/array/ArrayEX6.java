package com.shelar.java.array;

public class ArrayEX6 {

	public static void main(String[] args) {
		//data type array name[];
		int a[];
		int []b; // declaration
		String s[];
		
		//construction of array.
		//arrayname=new datatype[size];
		a=new int[4];
		b=new int[] {1,2,3,4}; //
		s=new String[] {"suresh","ramesh"};
		
		//initialization dynamic
		a[0]=4;
		a[1]=5;
		a[2]=6;
		a[3]=7;
		
		System.out.println("************");
		
		//static initialization.
		int x[]= {10,20,30,40};
		
		System.out.println(x.length);
		for(int j=0;j<x.length;j++) {
			
			System.out.println(x[j]);
			
		}
		
		
		System.out.println("************");
		
		
		
		
		
		
		//Retrieving
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		// for loop
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

		for(int k=0;k<s.length;k++) {
			System.out.println(s[k]);
			
		}
	}

}
