package com.shelar.java.basics;

public class Student1 {
		int  RollNo;
		long MobileNo;
		static String Branch,Address;
		String Name;
		int Marathi,Hindi,English,Math,Science,Socialscince,Percentage,Grade;
		
		 void setData(int RlNo,long MobNo,String name,int Mar,int hindi,int Engl,int math,int science,int socialscience){
			 RollNo=RlNo;
			 MobileNo=MobNo;
			 Name=name;
			 Branch="Science";
			 Address="Pune";
			 Marathi=Mar;
			 Hindi=hindi;
			 English=Engl;
			 Math=math;
			 Science=science;
			 Socialscince=socialscience;
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
			Student1 s1=new Student1();
			s1.setData(1,1234567891,"kalu",60,70,75,80,75,60);
			s1.Display();
			s1.Percentage();
			Student1 s2=new Student1();
			s2.setData(2, 0123451312, "Suraj", 70, 50, 65, 40, 70, 80);
			s2.Display();
			s2.Percentage();
		}

	}
