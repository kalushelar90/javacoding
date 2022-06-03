package com.shelar.java.strings;

public class WithoutNewOperator {

	public static void main(String[] args) {
		
// without using new operator.
		
		String str1="ATM";
		String str2="PUNE";
		String str3="Testing";
		
		String str4=str1;
		
		String str5=str2;
		
		String str6=str1+str2;//will create new object with new memory location.
		
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		System.out.println("****************************");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		
		System.out.println("****************************");
		
		System.out.println(str2==str6);
		System.out.println(str2==str5);
		
		System.out.println("****************************");
		
		System.out.println(str3==str4);
		System.out.println(str3==str5);	
	}

}
