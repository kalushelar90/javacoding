package com.shelar.java.polymorphism;

public class Overloading1 {
	double sum;
	void sum (int a,int b) {
		sum=a+b;
	}
	void sum (int a,double b) {
		sum=a+b;
	}
	void sum (double a,double b) {
		sum=a+b;
	}
	void sum (double a,int b) {
		sum=a+b;
	}
	void display() {
		System.out.println("sumation is:"+sum);
	}
	public static void main(String[] args) {
		Overloading1 o1=new Overloading1();
		o1.sum(10.2, 20.2);
		o1.display();
		o1.sum(10.2, 10);
		o1.display();
		o1.sum(10, 20.5);
		o1.display();
		o1.sum(10, 15);	
		o1.display();
	}

}
