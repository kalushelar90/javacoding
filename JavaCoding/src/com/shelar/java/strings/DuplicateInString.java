package com.shelar.java.strings;

public class DuplicateInString {

	public static void main(String[] args) {
		String str=" jdk java Jdk JDk java JAVA jre ";
		
		String str1=str.trim();
		
		String str2=str1.toLowerCase();
		
		String words[]=str2.split(" ");
		
		
		for(int i=0;i<words.length;i++) {
			
			int count=1;
			
		for(int j=i+1;j<words.length;j++) {
			if(words[i].equals(words[j])) {
				count++;	
				words[j]="0";
				
				}
			}
		
		if((count!=0)&&(words[i]!="0")){
			System.out.println(words[i]);
			System.out.println("count"+ count);
			
			}
		}	
	}
}
