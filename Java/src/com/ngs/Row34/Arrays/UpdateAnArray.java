package com.ngs.Row34.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateAnArray 
{
	 public static String[] add_element(int n, String myarray[], String ele) 
	    { 
	         int i; 
	 
	         String newArray[] = new String[n + 1]; 
	        //copy original array into new array
	        for (i = 0; i < n; i++) 
	              newArray[i] = myarray[i]; 
	 
	        //add element to the new array
	        newArray[n] = ele; 
	 
	        return newArray; 
	    } 
	 
	     public static void main(String[] args) 
	    { 
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("Enter your number ");
	        int n = sc.nextInt(); 
	        int i; 
	 
	        // Original array with size 5 
	        String myArray[] = { "chotu", "rasheed", "pk", "tej", "jas" }; 
	 
	        System.out.println("Original Array:\n"  + Arrays.toString(myArray)); 
	        //new element to be added to array
	        System.out.println("enter element new element");
	        String ele =sc.next() ; 
	 
	        myArray = add_element(n, myArray, ele); 
	 
	        System.out.println("\nArray after adding " + ele + ":\n" + Arrays.toString(myArray)); 
	    } 

}
