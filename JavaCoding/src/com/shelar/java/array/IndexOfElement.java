package com.shelar.java.array;

import java.util.Scanner;

public class IndexOfElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size");
		
		int size=sc.nextInt();
		
		int number[]=new int[size];
		
		System.out.println("enter array element");
		
	for (int i = 0; i < size; i++) {
		number[i]=sc.nextInt();
	}
	
	System.out.println("enter search element");
	
		int x=sc.nextInt();
		
		for (int i = 0; i < number.length; i++) {
		if(number[i]==x)
			
			System.out.println("index of search element:"+i);}
		
	}

}