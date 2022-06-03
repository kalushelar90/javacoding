package com.shelar.java.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		int a[][]=new int[3][4];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[0][3]=11;
		
		a[1][0]=6;
		a[1][1]=5;
		a[1][2]=4;
		a[1][3]=12;
		
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		a[2][3]=13;
			
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].length);
			
		for(int j=0;j<a[i].length;j++) 
			{
			System.out.println(a[i][j]);
			}
		
		}
	System.out.println(a.length);
	
	
	
	}
	
}
