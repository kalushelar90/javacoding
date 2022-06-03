package com.shelar.java.array;
public class SecondLargestElement {
	public static void main(String[] args) {	
		int temp=0;
		int a []=new int [] {20,10,40,60,10,50,60,70,80};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				
				}
				
			}
			
		}
		System.out.println(a[a.length-2]);
	}

}
