package com.shelar.java.strings;

public class StringUseNewOper {

	public static void main(String[] args) {
		//using the literals  or using new operator
			
		String str1=new String("ATM");
		String str2=new String("Pune");
		String str3=new String("Testing");
		String str4=new String("AtM");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str1==str4);
		
		System.out.println(str1.equals(str4));
		
		System.out.println(str1.equalsIgnoreCase(str4));
		
		
		
	}

}
