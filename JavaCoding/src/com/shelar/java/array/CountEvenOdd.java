package com.shelar.java.array;

public class CountEvenOdd {

	public static void main(String[] args) {
		int a[]=new int [] {1,2,3,4,5,6,7};
		int count=0;
		
		
		
		System.out.println("Even no in array are:" );
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			System.out.println( +a[i]);
		
			count++;
			}
		}
		
		System.out.println("EVEN no count in array  are:" + count);
		
		
		//************to count for odd numbers************
		
		count=0;
		
		System.out.println("odd nos in array are:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(+ a[i]);
				count++;
			}
		}
	System.out.println("Odd no count in array are:"+ count);
	}
	

}
