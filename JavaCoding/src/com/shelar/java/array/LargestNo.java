package com.shelar.java.array;

public class LargestNo {

	public static void main(String[] args) {
	
		int b[]=new int[] {31,10,21,30,20,40};
		
		for(int i=0;i<b.length;i++) {
			
			for(int j=i+1;j<b.length;j++) {
				
				if(b[i]>b[j]) {
					
					int temp=b[j];
					b[j]=b[i];
					b[i]=temp;
					
				}
			}
		}
	
		System.out.println(b[b.length-1]);
	}
}
