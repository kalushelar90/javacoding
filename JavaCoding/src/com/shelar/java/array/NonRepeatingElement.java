package com.shelar.java.array;

public class NonRepeatingElement {

	public static void main(String[] args) {
		{
			int a[]={10,5,1,9,4,6,1,10};
			int count;
			System.out.println("Non Repeating element in array");
			System.out.println(a.length);
			for(int i=0;i<a.length;i++)
			{
			count=0;
			//Initialize the for loop for checking the element which are not repeated)
			for (int j = i+1; j < a.length; j++)
			{
			//check the condition if any number is same so
			if(a[i]==a[j] && i!=j)
			count++;
			}
			//if count became zero so print the current element
			if(count==0)
			System.out.print(a[i]+" ");
			}
	}	
	}
}


		