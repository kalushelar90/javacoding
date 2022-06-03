package com.shelar.java.strings;

public class CharCount {

	public static void main(String[] args) {
		
		String str="My name is hemant";
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='m') {
				
				count++;	
			}
		}
		System.out.println("element present in string.");
		System.out.println("no of char 'm' counts in string is:"+ count);
	}

}
