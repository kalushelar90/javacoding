package com.shelar.java.basics;

public class ReturnTypes {
	static int total;
	int sub;
	public int add(int a,int b) 
	{
		 total=a+b;
		 return total;	 
	}
	public int sub(int a, int b)
	{
		sub=a-b;
		return sub;
	}
	public void display()
	{
		System.out.println("addition is :"+total);
		System.out.println("subtraction is :"+sub);	
	}
	public static void main(String[] args) {
		int returnTotal=0;
		int returnSub=0;
		double avg=0;
		double avg1=0;
		ReturnTypes obj=new ReturnTypes();
		//ReturnTypes obj1=new ReturnTypes();
		returnTotal=obj.add(200,100);
		returnSub=obj.sub(200, 100);
		
		obj.add(200, 100);
		obj.sub(300, 200);
		//obj1.add(500, 200);
		//obj1.sub(800, 100);
		obj.display();
		//obj1.display();
		
		avg=returnTotal/2;
		avg1=returnSub/2;
		System.out.println(+avg);
		System.out.println("subtraction average:"+avg1);
		
		
	}

}
