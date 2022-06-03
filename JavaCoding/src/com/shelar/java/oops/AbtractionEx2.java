package com.shelar.java.oops;

abstract class Shape{
	abstract double area();
}

class Rectangle extends Shape{
	double length =10;
	double width =20;
	public double area() {
		
		return(length*width);
		
	}
}

class triangle extends Shape{
	double base=20;
	double height=20;
	public double area() {
		
		return(0.5*base*height);
		
	}
}

public class AbtractionEx2 {

	public static void main(String[] args) {
		Shape S;
		S=new Rectangle();
		double d=S.area();
		System.out.println(d);
		S=new triangle();
		double t=S.area();
		System.out.println(t);
		

	}

}
