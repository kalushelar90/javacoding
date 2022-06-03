package com.shelar.java.array;

public class MaxMinElement {
	
public static void main(String[] args) {
	
int Array[]=new int []{10,20,30,40};//construction

			int max =Array[0], min=Array[0];
			
			for(int i = 0;i < Array.length;i++){
				
			if(Array[i] > max){
				
			max =Array[i]; //21
				}
			}
			System.out.println("Max value:"+max);
			
			System.out.println("--------------xxxxxxx-----------------");
			
			for(int i = 0;i < Array.length;i++){
				
			if(Array[i] < min){
			min = Array[i];
					}
				}
			System.out.println("min Value:"+min);
			}
	}