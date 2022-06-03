package com.shelar.java.array;

public class SumAndAvarage {

	public static void main(String[] args) {
	
		int sum=0;
		int number[]=new int [] {2,7,10,6,4,8};
		System.out.println(number.length);
		
		for(int i=0;i<number.length;i++) {
			
		sum=sum+number[i];
		
		}
		
		System.out.println("sum of array no." + sum);
		
		int avg=sum/(number.length);
		System.out.println("avg is="+ avg);
		

	}

}
