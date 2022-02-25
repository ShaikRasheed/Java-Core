package com.ngs.Exceptions;

public class Try_catchBlock {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println("To handle Exception by using try&Catch Blocks "+e);  
	        }  
	        System.out.println("rest of the code");  
	    }  
}


