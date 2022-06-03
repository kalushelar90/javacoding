package com.shelar.java.exceptionhandling;

public class throwsEx1 {
	
	void m1() throws InterruptedException 
	{
		Thread.sleep(1000);
	}
	
	void m2()// throws InterruptedException 
	{
		//Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException  
	{
		throwsEx1 ex=new throwsEx1();
	ex.m1();
	ex.m2();
	
	}

}
