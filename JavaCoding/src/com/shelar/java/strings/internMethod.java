package com.shelar.java.strings;

public class internMethod {

	public static void main(String[] args) {
		String str1=new String("Welcome to javaTpoint");
		String str2=new String("Welcome to javaTpoint");
		System.out.println(str1==str2); // prints false.
		
		
		//with intern method
		
		String str3=new String("Welcome to My home").intern();
		String str4=new String("Welcome to My home").intern();
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);// prints true.
		
		System.out.println(str2==str4);//prints false
		
		
/*whenever we create string using new operators,
 * object created and new memory location is assign 
 * to that operator in heap area.
 * when we create again new string with same contain,
 * it creates new object with new memory location in heap.
 * It is bad practice to allocate different memory location for same content or data.
 * To overcome this intern method is used.
 * 
 * syntax-String <Stringname>=new String("value").intern();
 * 
 * using this method we check either same memory is allocated for same data and after
 *  that new memory location is created.
*/
		

	}

}
