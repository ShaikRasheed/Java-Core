package com.ngs.row20.Local.Instance.StaticVariables;

public class StaticBlock 
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
		StaticBlock ivs=new StaticBlock();
		// TODO Auto-generated method stub
		System.out.println(ivs.name);
		ivs.InvokingStaticnon("Rasheed");
		System.out.println(InvokingStaticnon.name);//String Constant pool
	}
	static 
	{
		System.out.println("Static print frist");
	}

}
