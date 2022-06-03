package com.shelar.java.strings;

public class StringBufferEX {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("ATM");
		
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Bank");
		
		StringBuffer sb2=sb.append("online payment");
		
		StringBuffer sb3=new StringBuffer("cash");
		
		System.out.println("***************************");
		
		System.out.println(sb);
		
		System.out.println("________1____________________");
		
		System.out.println(sb1);
		System.out.println("__________2__________________");
		
		System.out.println(sb2);
		System.out.println("__________3__________________");
		
		System.out.println(sb3);
		
		System.out.println("___________4_________________");
		
		System.out.println(sb1==sb);
		System.out.println(sb1==sb2);
		System.out.println(sb1==sb3);
		System.out.println(sb2==sb);
		
		
		sb.append("Monkey");
		System.out.println(sb);
		sb.replace(1, 2, "suraj");
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		
	}

}
