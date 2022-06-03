package com.shelar.java.strings;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class x {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream file=new FileInputStream("E:\\1_TESTING\\1_AUTOMATION\\.TXT PROGRAM\\textreader.txt");
			
			InputStreamReader input=new InputStreamReader(file);
			
			BufferedReader reader=new BufferedReader(input);
			
			String line;
			int characterCount=0;
			int countWord=0;
			int sentenceCount=0;
			int paragraphCount=1;
			int whiteSpaceCount=0;
			
			
			while((line=reader.readLine())!=null) {
				if(line.equals("")) {
					paragraphCount=paragraphCount+1;
				}
			
			else {
				
				String sentenceList[]=line.split("[!?.:]+");
				sentenceCount=sentenceCount+sentenceList.length;
				
				
				String words[]=line.split("\\s+");
				countWord=countWord+words.length;
				
				
				
			
			/*	for(int i = 0; i < line.length(); i++) {    
		           if(line.charAt(i) != ' ')    
		           	characterCount++;    
		       }    */
			characterCount=characterCount +line.length();	//problem as whitespaces are count
				
				
				
				whiteSpaceCount=(countWord-1);
				
				
				}
			}
			System.out.println("Total word count="+ countWord);
			System.out.println("Total nummber of sentence="+ sentenceCount);
			System.out.println("Total nummber of character="+ characterCount);
			System.out.println("Total nummber of paragraph="+ paragraphCount);
			System.out.println("Total number of whitespaces="+ whiteSpaceCount);
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
