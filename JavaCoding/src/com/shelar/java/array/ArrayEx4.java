package com.shelar.java.array;

public class ArrayEx4 {

	public static void main(String[] args) {
		int []a;		// array  declaration.
		a=new int[3];		//array  constructor.
		a[0]=1;			//array initialization.
		a[1]=3;			//array initialization.
		a[2]=6;			//array initialization.
		
		// or 
		
		int b[]=new int[] {10,20,30};
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		for(int i=0;i<b.length;i++) {
			
			System.out.println(b[i]);
		}	
	}
}
