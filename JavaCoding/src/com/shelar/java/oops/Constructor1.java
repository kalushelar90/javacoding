package com.shelar.java.oops;

public class Constructor1 {
	int pId;
	int pAge;
	String pName;
	public Constructor1 (int id,int age,String name){
		pId=id;
		pAge=age;
		pName=name;
	}
	void display(){
		System.out.println("person id is:"+pId);
		System.out.println("person age is:"+pAge);
		System.out.println("person name is:"+pName);
	}

	public static void main(String[] args) {
		Constructor1 c=new Constructor1(30,20,"suresh");
		c.display();
		Constructor1 c1=new Constructor1(40,50,"Mahesh");
		c1.display();
	}

}
