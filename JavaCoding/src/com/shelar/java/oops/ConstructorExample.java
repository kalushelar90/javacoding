package com.shelar.java.oops;
public class ConstructorExample {
	int x,z;
	double y;
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);	
	}
	private ConstructorExample(){ //initialization of variable.can not be void.//default constructor.
		x=40;
		y=30;
		z=10;
	}
	public ConstructorExample(int a, int b){  //Parameterized constructor.	
			x=a;
			y=b;	
	}
	public ConstructorExample(int a,double b,int c) {
		x=a;
		y=b;
		z=c;
		}
	public static void main(String[] args) {
		ConstructorExample obj1=new ConstructorExample();//object creating,constructor gets executed.
		obj1.display();
				
		ConstructorExample obj2=new ConstructorExample(100,200);
		obj2.display();
		
		ConstructorExample obj3=new ConstructorExample(100,200,300);
		obj3.display();

	}

}
