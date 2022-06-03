package com.shelar.java.oops;

abstract class bank{
	abstract int getrateofintrest();
}
class SBI extends bank{
	int getrateofintrest() {
	return 7;
	}
}
class PNB extends bank{
	int getrateofintrest() {
		return 10;
	}
}

public class AbstractionEx3TestBAnk {

	public static void main(String[] args) {
		bank b;
		b=new SBI();
		System.out.println(b.getrateofintrest());

		b=new PNB();
		System.out.println(b.getrateofintrest());

	}

}
