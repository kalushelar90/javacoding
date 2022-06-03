package com.shelar.java.basics;

//import java.util.Scanner;

public class ArmstrongNo1 {

	public static void main(String[] args) {
		// Scanner obj=new Scanner (System.in);
		//System.out.println("enter the no:");
		//int number=obj.nextInt(); 
		int number=371;
		int originalNumber,remainder,result=0;
		originalNumber=number;
		
		while(originalNumber!=0) {
			remainder=originalNumber%10;
			result+=Math.pow(remainder,3);
			originalNumber/=10;
		}
		if(result==number)
			System.out.println(number +" is an armstrong no");
		else
			System.out.println(number +" is not an armstrong no");
		
		

	}

}
