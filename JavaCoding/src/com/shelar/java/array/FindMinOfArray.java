package com.shelar.java.array;

public class FindMinOfArray {
	
	static void  min(int a[]) {
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
			
			if(min>a[i])
				
				min=a[i];
		System.out.println(min);
	}
	
 static void  max(int a[]) {
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
			
			if(max<a[i])
				
				max=a[i];
		System.out.println(max);
	}

	public static void main(String[] args) {
		
		int a[]= {33,2,0,-3,-1,5};
		
		min(a);
		max(a);

	}

}
