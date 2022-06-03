package com.shelar.java.oops;

public class Access {

	public static void main(String[] args) {
	
		AcessModifier am2=new AcessModifier();
		
		am2.x=1000;//default 
		
		am2.y=2000;//public
		
		//am2.z=3000;// private modifiers ....can't access in different class.
		
	//	am2.displayX(); //private method..... can't access in different class.
		
		am2.DisplayY();//public...can access diff. class.
		
		am2.DisplayZ();//Default access diff. class.
		
	}

}
