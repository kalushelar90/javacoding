package com.shelar.java.collection;

import java.util.HashMap;

public class DuplicateCharInString {

	public static void main(String[] args) {
		
		String str="JDk jre jdk JRe Java jdk";
		String str1=str.toLowerCase();
		char ch []=str1.toCharArray();
		HashMap<Character,Integer>hm=new HashMap<>();
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
	System.out.println(hm);
	}
}