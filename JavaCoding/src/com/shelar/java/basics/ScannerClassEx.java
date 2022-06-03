package com.shelar.java.basics;

import java.util.Scanner;

public class ScannerClassEx {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name:");
		String userName=obj.nextLine();
		System.out.println("Username is:"+userName);

	}

}