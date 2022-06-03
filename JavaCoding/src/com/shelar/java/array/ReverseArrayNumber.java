package com.shelar.java.array;

public class ReverseArrayNumber {

	public static void main(String[] args) {
		
		int a[]=new int[] {10,5,7,9,4,6};
		
		int length=a.length;
		
		System.out.println("original array elements:");
		
		for (int i = 0; i < length; i++){	
		System.out.println(a[i]);  // prints original elements of array.
		}
		
		
		//_________Reverse Logic___________
		
		for (int i = 0; i < length/2; i++) {      ////[10,5,7,9,4,6]
			
		int temp=a[i];
		
		a[i]=a[length-1-i];     //a[0]=a[5];()enter change.
		
		a[length-1-i]=temp;
		
		}
		
		System.out.println("reversed array elements:");
		
		for (int i = 0; i < length; i++)
		{
			System.out.println(a[i]);
			}
			}
			}