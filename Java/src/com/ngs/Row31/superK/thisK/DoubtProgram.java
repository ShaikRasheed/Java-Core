package com.ngs.Row31.superK.thisK;

public class DoubtProgram 
{
	String name="chotu";
	int rollno=109;
	int phone=8978;

	public DoubtProgram()
	{
		 
		name = name;
		this.rollno=rollno;
		phone=phone;
		System.out.println("my instance name" + name + phone);
	}
	public  DoubtProgram(String name,int rollno)
	{
		name=name;
		this.rollno=rollno;
		 
		System.out.println("my local name is "+name + this.name +rollno+"  "+this.phone+phone);
	}
	public DoubtProgram(String name,int rollno,int phone)
	{
		this(name,rollno);
	}
	public static void  main(String[] args)
	{
		DoubtProgram doubtProgram2 = new DoubtProgram();
		
		DoubtProgram doubtProgram = new DoubtProgram("rasheed",198);
		
		DoubtProgram doubtProgram1 = new DoubtProgram("praveen",199,88937);
	}

	 
}
