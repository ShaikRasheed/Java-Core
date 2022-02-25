package com.ngs.Row32.Final;

public class FinalK 
{  
		   //Blank final variable
		   final int a;
			int b=10;
		   FinalK()
		   {
			 //It must be initialized in constructor 
		      a = 100;
		      System.out.println(a);
		   }
		   void myMethod()
		   {  
			  
		      System.out.println(a);
		   }  
		   public static void main(String args[])
		   {  
			   FinalK obj=new FinalK(); 
			   System.out.println(obj.b=98);
		      obj.myMethod();  
		     // System.out.println();
		   }  

}
