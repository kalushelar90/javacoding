package com.shelar.java.array;

public class ThirdLargeElement {

	public static void main(String[] args) {
		int temp=0;
		
		int a[]=new int []{1,2,3,4,5,8};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println(a[a.length-3]);
	}

}
