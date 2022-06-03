package com.shelar.java.inheritance;
class RBI{
	int getRateofintrest() {
		return 0;
	}
}
class SBI extends RBI{
	int getRateofintrest() {
		return 10;
	}
}
class axis extends RBI{
	int getRateofintrest() {
		return 15;
	}
}
class HDFC extends RBI{
	int getRateofintrest() {
		return 18;
	}
}
public class Hierachikalnheritance {
public static void main(String[] args) {
		SBI sbobj=new SBI();
		System.out.println(sbobj.getRateofintrest());
		HDFC hdobj=new HDFC();
		System.out.println(hdobj.getRateofintrest());
		axis axobj=new axis();
		System.out.println(axobj.getRateofintrest());
		
		
		
		
	}

}
