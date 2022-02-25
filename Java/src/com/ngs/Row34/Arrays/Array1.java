package com.ngs.Row34.Arrays;

import java.util.*;
public class Array1 
{
	//write a function to add integer values of an array.
	public void addarray()
	{
		int Store=0,sum=0;
		int[] intArray;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size");
		int sz=sc.nextInt();
		intArray= new int[sz];
		System.out.println("enter your numbers");
		
			for(int i=0;i<sz;i++)
			{
			
				intArray[i]=sc.nextInt();
				
			}
			for(int i=0;i<intArray.length;i++)
			{
				
				//System.out.println(intArray[i]);
				sum +=intArray[i];// here i am adding one element to sum 
				System.out.println(sum);
			}
			
	}
	//write a function to calculate the average value of an array
	public void Average()
	{
		int sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size an array");
		int sz=sc.nextInt();
		 
		int array[]=new int[sz];
		System.out.println("Enter array elements");
		for(int i=0;i<sz;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			
			sum=array[i]+sum;
			avg=sum/sz;
			//System.out.println("sum of the numbers is = "+sum+"average "+avg);
		}
		System.out.println("sum of the numbers is = "+sum+"average "+avg);
	}
	public int index(int[] my_array, int t)
	{
		 
		 
		if (my_array == null) return -1;// here we are checking the array is empty or not.
		
	        int len = my_array.length;
	        int i = 0;
	        while (i < len) 
	        {
	            if (my_array[i] == t) return i;
	            else i=i+1;
	        }
	        return -1;
	}
	public static void main(String[] args)
	{
		// different type of declarations
		int[] intArray;// declaring integer array with the variable intarray
		int intArray1[];//declaring integer array with the variable intarray1

		String[] stringArray;//declaring String array with the variable stringArray
		String   stringArray1[];//declaring String array with the variable stringArray1

		Array1[] myClassArray;
		Array1   myClassArray1[];
		Array1 ar=new Array1();
		//ar.addarray();
		//ar.Average();
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("Index position of 7 is: " +ar.index(my_array, 56));
		ar.index(my_array, 14);
		 System.out.println("Index position of 2 is: " +ar.index(my_array, 2));
		
		
	}
}
