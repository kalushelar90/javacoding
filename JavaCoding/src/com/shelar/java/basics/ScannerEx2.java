package com.shelar.java.basics;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner myobj=new Scanner (System.in);
		
		
		System.out.println("Enter name , age , salary:");
		
		String name=myobj.nextLine();
		int age=myobj.nextInt();
		double salary=myobj.nextDouble();
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
		System.out.println("salary is:"+salary);
		

	}

}
