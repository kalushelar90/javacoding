package com.shelar.java.oops;

public class Constructor2 {
	int sId;
	int sAge;
	String sName;
	long mNo;
Constructor2(int id,int age,String name,long no) {
		sId=id;
		sAge=age;
		sName=name;
		mNo=no;	
	}
void display() {
	System.out.println("Student id is:"+sId);
	System.out.println("Student age is:"+sAge);
	System.out.println("Student name is:"+sName);
	System.out.println("Student mobile no: is:"+mNo);
}
	public static void main(String[] args) {
		Constructor2 c2= new Constructor2(10,20,"samir",1234677);
		c2.display();	
		Constructor2 c3=new Constructor2(222,30,"hemant",123572256);
		c3.display();
	}
}
