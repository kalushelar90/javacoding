package com.shelar.java.practice;
class IfPract {

	public static void main(String[] args) {

		int a=-12;
		
		if (a%2==0) {
			
			System.out.println("no is odd");
			
			if(a>0) {
			System.out.println(" and no is positive");	
		}
			else {
				System.out.println("and no is negative.");	
			}
		}
		else {
			System.out.println("no is not odd"+a);
			
			if(a>0) {
				System.out.println("and no is positive");	
			}
				else {
					System.out.println("and no is negative.");
				}
		}
	}
}

