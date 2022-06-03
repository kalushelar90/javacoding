package com.shelar.java.strings;

public class CharPosition {

	public static void main(String[] args) {
		String str="Hi i am a string";
		char c[]=str.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a') {
				count++;
				System.out.println("Element is present in String");
				
				System.out.println("Position of element is:"+ i);
			}	
		}
		System.out.println("counts for char repeated:"+ count);
		
	}

}
