package com.shelar.java.oops;

public class AcessModifier {
	
	int x=10;
	
	public int y=20;
	
	private int z=30;
	
	private void DisplayX() {
		System.out.println(x);	
	}
	
	public void DisplayY() {
		System.out.println(y);
	}
	
	void DisplayZ() {
	System.out.println(z);
	}
	
	public static void main(String[] args) {
		AcessModifier am= new AcessModifier();//new access modified created to insert value in main method.
		am.DisplayX();//to display value of x
		am.DisplayY();//to display value of y
		am.DisplayZ();//to display value of z
		am.x=100;// to assign new value to x
		am.y=200;// to assign new value to y
		am.z=300;// to assign new value to z
		am.DisplayX();//to display change the value of x
		am.DisplayY();//to display change the value of y
		am.DisplayZ();//to display change the value of z
	}

}
