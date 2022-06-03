package com.shelar.java.accesspecifier;

 public class AccessSpecifier {
	public int a,b;
	
	public AccessSpecifier() {
		a=30;
		b=40;	
	}
	public void adition() {
		System.out.println("adition is:"+(a+b));
	}

	void subtraction() {
		System.out.println("subtraction is:"+(a-b));	
	}
	private void Multipliction() {
		System.out.println("Multiplication is:"+(a*b));
	}
	protected void Division() {
		System.out.println("Division is:"+(b/a));
	}
	
	public static void main(String[] args) {
		AccessSpecifier obj1=new AccessSpecifier();
		obj1.adition();
		obj1.subtraction();
		obj1.Multipliction();
		obj1.Division();	
	}
}
//conclusion-default,public,private,protected all are accessed in same class.