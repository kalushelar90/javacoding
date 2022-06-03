package com.shelar.java.strings;

public class CharInString {

	public static void main(String[] args) {
		
		String str="java for automation";
		
		char [] c=str.toCharArray();
		int count=0;
		
		for(int i=0; i<c.length;i++) {
			
			if(c[i]=='o') {
				count++;
				
				System.out.println("char is in string :"+ c[i]);
				System.out.println("char index is:"+ i);
			}	
		}
		System.out.println("char a count is:"+ count);
	}
}
