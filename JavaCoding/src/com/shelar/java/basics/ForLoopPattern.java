package com.shelar.java.basics;

/* Program to print below pattern
*
**
***
****
*****
 */

public class ForLoopPattern {

	public static void main(String[] args) {
		int i,j;
		for (i=1;i<=5;i++) {
			
			for (j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	
	}

}
