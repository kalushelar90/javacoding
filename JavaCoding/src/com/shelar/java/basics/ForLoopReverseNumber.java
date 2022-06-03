package com.shelar.java.basics;

public class ForLoopReverseNumber {

	public static void main(String[] args) {
		
		int number=12345,revers=0;
		
	//for(;number!=0;) {
		
		while(number!=0){
		
		//int remainder=number%10;
		
		// revers=revers*10+remainder;
			
			revers=(revers*10)+(number%10);
		 
			number=number/10;
	}
		System.out.println(revers);

	}

}
