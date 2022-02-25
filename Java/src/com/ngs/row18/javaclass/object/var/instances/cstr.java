package com.ngs.row18.javaclass.object.var.instances;
public class cstr 
{
	String name;
	//int age,marks;
	public  cstr(String name)//,int age,int marks)
	{
		this.name = name;
	}
	public cstr(cstr napc)
	{
		this.name = napc.name;
		System.out.println(napc.name);
	}
}
