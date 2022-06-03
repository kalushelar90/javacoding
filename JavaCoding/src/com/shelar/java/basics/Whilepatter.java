package com.shelar.java.basics;
/* 
 pattern using while loop
 12345
 1234
 123
 12
 1
 */

public class Whilepatter {

	public static void main(String[] args) {
		int i=1,j=1;
		while (i<=10) {
			while (j>=i) {
				System.out.print(j);
				j++;
			}
			
		System.out.println();
		}
				

	}

}
