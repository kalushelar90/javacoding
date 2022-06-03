package com.shelar.java.strings;

public class CharPosition1 {

	public static void main(String[] args) {
		String str="My name is hemant";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='m') {
				count++;
				System.out.println("Element present in the string");
				System.out.println("position of elemnt is:"+i);
			}
		}
		System.out.println("char count is:"+ count);
	}

}
