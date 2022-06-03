package com.shelar.java.basics;

public class DataTypeByte {

	//global data types
	
	byte b1;
	byte b2=23;
	byte b3=127;
	byte b4=-128;
	byte b5=(byte)128; //data loss
	byte b6=(byte)-129; //data loss
	short s1=129;
	
	void display() {
		System.out.println("i am from Display method");// not printed as it is not in main method.
		DataTypeByte obj=new DataTypeByte();
		System.out.println(obj.b1);
		System.out.println(obj.b2);
	}
	
	public static void main(String[] args) {
		
		DataTypeByte obj=new DataTypeByte();
		
		System.out.println(obj.b1);
		System.out.println(obj.b2);
		System.out.println(obj.b3);
		System.out.println(obj.b4);
		System.out.println(obj.b5);
		System.out.println(obj.b6);
		System.out.println(obj.s1);
		obj.display();
	}

}
