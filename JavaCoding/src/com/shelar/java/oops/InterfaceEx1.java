package com.shelar.java.oops;
interface Base{
	int x=10;
	void m1();
	void m2();
	void m3();
}
interface Sample2{
	int y=30;
	void m5();	
}
class A{
	void m4() {
	System.out.println("i am from class A,m4 method");
	}
}
class derived extends  A implements Base,Sample2{
	public void m1() {
		System.out.println("i am implements m1");
	}
	public void m2() {
		System.out.println("i am implements m2 method.");
	}
	public void m3() {
		System.out.println("i am implements m3 method.");	
	}
	public void m5() {
		System.out.println("i am implementing m5 method.");		
	}
}
public class InterfaceEx1 {
public static void main(String[] args) {
		derived d= new derived();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		d.m5();
	//	System.out.println(Sample2.y);
	//	System.out.println(Sample.x);
		// Base sref=new derived();
		//sref.m1();
		//sref.m2();
		//sref.m3();
		//Sample2 sref1=new derived();
		//sref1.m5();
	}
}