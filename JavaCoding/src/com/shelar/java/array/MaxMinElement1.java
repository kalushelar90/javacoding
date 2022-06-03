package com.shelar.java.array;

public class MaxMinElement1 {

	public static void main(String[] args) {
		int elment[]=new int [] {-1,-2,-3,-4,-5,-6,-7};
		int min=0;
		
		for(int i=0;i<elment.length;i++) {
			
			if(elment[i]<min) {
				min=elment[i];
			}
		}
		System.out.println("Minimum value is:"+ min);
		
		int max=min;
		{for(int i=0;i<elment.length;i++) 
		{
			if(elment[i]>max) 
			{
				max=elment[i];
			}
		}	
		System.out.println("maximun value is:"+ max);
		}	
	}
}

