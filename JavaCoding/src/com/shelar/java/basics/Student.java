package com.shelar.java.basics;

public class Student {
	
	int  RollNo;
	long MobileNo;
	String Name;
	static String Branch,Address;
	int Marathi,Hindi,English,Math,Science,Socialscince,Percentage,Grade;
	
	 void setData(){
		 RollNo=1;
		 MobileNo=1224567891;
		 Name="Suresh";
		 Branch="scince";
		 Address="Pune";
		 Marathi=60;
		 Hindi=75;
		 English=65;
		 Math=90;
		 Science=80;
		 Socialscince=90;
		  }

	 void Percentage() {
		 Percentage=((Marathi+Hindi+English+Math+Science+Socialscince)*(100) / (600));	
		 System.out.println("Percentage:"+Percentage);
		 if(Percentage<35) 
			 System.out.println("Grade:Fail");
		 else if ((Percentage>=35)&&(Percentage<50)) {
			 System.out.println("Grade:Pass class");
		 }
		 else if ((Percentage>=50)&&(Percentage<60)) {
			 System.out.println("Grade:second class");
		 }
		 
		 else if ((Percentage>=60)&&(Percentage<70)) {
			 System.out.println("Grade:First class");
		 }
		 else  {
			 System.out.println("Grade:First class with distinction");
		 }
	 }
	 
	 void Display() {

		 System.out.println("*****************************");
		 System.out.println("___________Result____________");
		 System.out.println("*****************************");
		 
		 
		 System.out.println("RollNO:"+RollNo);
		 System.out.println("MobileNo:"+MobileNo);
		 System.out.println("Name:"+Name);
		 System.out.println("Branch:"+Branch);
		 System.out.println("Address:"+Address);
		 System.out.println("Marathi:"+Marathi);
		 System.out.println("Hindi:"+Hindi);
		 System.out.println("English:"+English);
		 System.out.println("Math:"+Math);
		 System.out.println("Science:"+Science);
		 System.out.println("Socialscince:"+Socialscince);
	 }
	 
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setData();
		s1.Display();
		s1.Percentage();
	}

}
