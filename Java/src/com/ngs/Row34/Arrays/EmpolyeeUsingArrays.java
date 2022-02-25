package com.ngs.Row34.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EmpolyeeUsingArrays 
{
	public void addemp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option");
		int a=sc.nextInt();
		
			System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your salary");
		String salary=sc.next();
		String[] firstArray = {name,salary};
		while(a!=0)
		{
			 //initialized array
		
		//String[] secondArray = {"11","14","9","5","2","23","15"};  
			int length = firstArray.length*2; //add the length of firstArray into secondArray  
			String[] mergedArray = new String[ firstArray.length*firstArray.length];    //resultant array  
			int pos = 0;  
			for(String element : firstArray) //copying elements of secondArray using for-each loop  
			{  
				mergedArray[pos] = element;  
				pos++;              //increases position by 1  
			}  
		/*for (String element : secondArray) //copying elements of firstArray using for-each loop  
		{  
			mergedArray[pos] = element;  
			pos++;  
		} */ 
		
	System.out.println(Arrays.toString(mergedArray));   //prints the resultant array  
	}  
	}
	public static void main(String[] args)
	{
		EmpolyeeUsingArrays emp=new EmpolyeeUsingArrays();
		emp.addemp();
	
	
	}
}
/*Scanner sc=new Scanner(System.in);
System.out.println("enter your option to add employees or not\n 0 To exit 1 To add employee");
int a=sc.nextInt();
System.out.println("enter  employee ");
//int k=0;
//String[] array=new String[3];
//String[] array1=new String[array.length*2];
while(a!=0)
{

	System.out.println("enter your employee name");
	String name=sc.next();
	System.out.println("enter your age ");
	int age=sc.nextInt();
	System.out.println("enter your designation");
	String design=sc.next();
	System.out.println("enter your salary");
	String salary=sc.next();
	int ar=array.length;
	String newarray[]=new String[ar++];


	for(int i=0;i<3;i++)
	{
		array[i]=name+" "+salary;
	}	
	for(int i=0;i<3;i++)
	{
		array[i]=name+" "+salary;
	}	
	for(int i=0;i<array.length;i++)
	{
		newarray[k]+=array[i];
		System.out.println(array[i]);
		System.out.println(Arrays.toString(array));
		System.out.println(newarray[k]);
	
	}

 
System.out.println("your name=  "+name+"  your salary= "+salary);
System.out.println("enter your option to add employees or not\n 0 To exit 1 To add employee");
a=sc.nextInt();
 
  
 
 

}

//System.out.println(array1[k]);
System.out.println("your are exited");
}*/