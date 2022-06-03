package com.shelar.java.strings;

import java.io.FileInputStream;
import java.io.InputStreamReader;
public class DataStreamExample {

	public static void main(String[] args) {
		
		//Creates an array of character
		char[] array=new char[100];
		
		try {
			
			//Creates a FileInputStream
			
		 FileInputStream file = new FileInputStream("E:\\1_TESTING\\textreader.txt");//used to read file in bytecode.in(give path of file).
		
		 //Creates a InputStreamReader
		 
		 InputStreamReader input=new InputStreamReader(file);// used to read file bytecode into character.
		
		 //reads character from the file
		 input.read(array);
		 
		 System.out.println("Data in the stream:");
		 System.out.println(array);
		 
		 //close the reader
		 input.close();
		
		} catch (Exception e)  {
			
			e.printStackTrace();
		}

	}

}
