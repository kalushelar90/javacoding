package com.shelar.java.strings;

import java.util.Arrays;

public class WordCountInString {

	public static void main(String[] args) {
		
		String str="Vyasa Testing Manual";
		
		String str1=str.trim();
		
		String words[]=str1.split(" ");
		System.out.println("words count in string:"+ words.length);
		System.out.println(Arrays.toString(words));//to print array of string
	}

}
