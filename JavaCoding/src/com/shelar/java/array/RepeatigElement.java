package com.shelar.java.array;

public class RepeatigElement {

	public static void main(String[] args) {
	
		int a[]=new int [] {10,5,1,9,4,6,1,10};
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {	
				
				if((a[i]==a[j])&&(i!=j)) {
					count ++;	
					System.out.println("count:"+ count);
					System.out.println("Repeating element in string:"+ a[i]);
					
				}	
			}
		}	
	}
}
