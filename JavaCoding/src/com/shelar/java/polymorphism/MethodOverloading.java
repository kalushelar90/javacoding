package com.shelar.java.polymorphism;

public class MethodOverloading {
	int srNo,age,PanCardNO;
	String Name;
	long MobileNo,AdharcardNo,VotingCardNO;
void display() {
	System.out.println("********for registration of ___scim********");
}
//void setdata(int SRNO,String name,int Age,long MObNO,long adharNO,int pancardno,long votingcardno) {
	//srNo=SRNO;
//	age=Age;
//	Name=name;
//	MobileNo=MObNO;
//	AdharcardNo=adharNO;
//	PanCardNO=pancardno;
//	VotingCardNO=votingcardno;
	
//}

void Registration(int srNo,String Name,int age,long MobileNo,long AdharcardNo,int PanCardNO,long VotingCardNO) {
	System.out.println("Registration is completed");
	
}
void Registration(int srNo,String Name,int age,long MobileNo,long AdharcardNo,int PanCardNO) {
	System.out.println("Registration is completed");
}
	
void Registration(int srNo,String Name,int age,long MobileNo,long AdharcardNo) {
		System.out.println("Registration is completed");
	
}
void display1() {
	System.out.println("nomines details are below.");
	System.out.println("Serial No:"+srNo);
	System.out.println("Name :"+Name);
	System.out.println("Age is:"+age);
	System.out.println("Mobile Number:"+MobileNo);
	System.out.println("AdharCard Number:"+AdharcardNo);
	System.out.println("Pancard Number:"+PanCardNO);
	System.out.println("votingcard Number:"+VotingCardNO);
}
	public static void main(String[] args) {
		MethodOverloading o=new MethodOverloading();
		//o.setdata(1, "rahul", 20, 1234567, 87654, 1345, 514433);
		o.display();
		o.Registration(2, "kalu", 30, 91308041, 7614267);
		o.display1();
	}

}
