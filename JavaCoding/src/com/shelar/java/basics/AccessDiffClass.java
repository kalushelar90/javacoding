package com.shelar.java.basics;

import com.shelar.java.oops.AcessModifier;

public class AccessDiffClass {

	public static void main(String[] args) {
		
		AcessModifier am3=new AcessModifier();
		//am3.x; Default.......within package only.
		
		am3.y=10000;
		
		//am3.z; private ......within class only.
		
		//am3.DisplayX(); //private method....can access in same class.
		am3.DisplayY();   //public method....can access anywhere. 
		//am3.DisplayZ();   //default method ....can access in same package.
		
		

	}

}
