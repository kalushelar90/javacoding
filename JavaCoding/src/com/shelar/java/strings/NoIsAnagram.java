package com.shelar.java.strings;

import java.util.Arrays;

public class NoIsAnagram {

	public static void main(String[] args) {

		String str="1221";
		
		String str1="1234";
		
		str=str.toLowerCase();
		str1=str1.toLowerCase();
	
		if(str.length()==str1.length()) {
		
		char[] char1=str.toCharArray();
		
		char[] char2=str1.toCharArray();
		

		Arrays.sort(char1);
		
		Arrays.sort(char2);
	
		System.out.println(Arrays.toString(char1));
		
		System.out.println(Arrays.toString(char2));
		
		
		boolean result =Arrays.equals(char1, char2);
		
			if(result) {
				System.out.println("String is Anagram");	
			}
			
			else {
				System.out.println("String is not Anagram");
				}
			}
		}	

	}

