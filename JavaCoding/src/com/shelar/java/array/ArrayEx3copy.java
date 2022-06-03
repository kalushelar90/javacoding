package com.shelar.java.array;

public class ArrayEx3copy {

	public static void main(String[] args) {
	int a[]=new int[] {1,2,3,4,5};
	int b[]=new int[a.length];
	
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
		
	}
		System.out.println("display elements of array 1");
		for(int i=0;i<a.length;i++) {
			System.out.println(+a[i]);
		}
 System.out.println();
 System.out.println("display elemnts of array2");

for(int i=0;i<b.length;i++) {
	System.out.println(+b[i]);
}
	}

}
