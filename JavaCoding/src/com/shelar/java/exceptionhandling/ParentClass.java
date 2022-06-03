package com.shelar.java.exceptionhandling;

public class ParentClass {

	public static void main(String[] args) {
	    
		   try{    
		    int a[]=new int[5];    
		    a[5]=30/0;    
		   }    
		   catch(Exception e)
		   {
			   System.out.println("common task completed");
		   }  
	}
}
		/*   catch(ArithmeticException e)
		   {
			   System.out.println("task1 is completed");
			   }    
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println("task 2 completed");
			   }    
		   System.out.println("rest of the code...");    
		 } 		  
}*/
////error as child to parent class should be maintain, here already exception already handle by parent class exception e