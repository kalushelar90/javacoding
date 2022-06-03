package com.shelar.java.array;

public class ToDimentionalArray {

	public static void main(String[] args) {
		int a[][]=new int[][] {{10,20},{30,40},{50,60}};
		
		for(int i=0;i<a.length;i++) {
			
			
			
			for(int j=0;j<a[i].length;j++) {
				;
				System.out.println(a[i][j]);
			}
			System.out.println(a[i].length);
		}

	}

}
