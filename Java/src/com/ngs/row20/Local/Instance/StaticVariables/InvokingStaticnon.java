package com.ngs.row20.Local.Instance.StaticVariables;

public class InvokingStaticnon 
{
	static String name="Chotu";
	public void  InvokingStaticnon(String name)
	{
		this.name=name;
		System.out.println(this.name);
		int age=198;
		
	}
	public static void main(String[] args) 
	{
		InvokingStaticnon invokingStaticnon = new InvokingStaticnon(); 
		System.out.println(invokingStaticnon.name);
		invokingStaticnon.InvokingStaticnon("Rasheed");
		System.out.println(InvokingStaticnon.name);//String Constant pool
		
	}

}
