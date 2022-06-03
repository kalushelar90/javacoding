package com.shelar.java.mock;

public class anagram {

	public static void main(String[] args) {
		int number=123;
		int rem=0,revnumber=0;
		
		
		rem=rem+(rem%10);
		
		revnumber=revnumber+rem;
		
		System.out.println("rev number is:"+revnumber);
	
	}		
}