package com.ngs.row18.javaclass.object.var.instances;

/*
*	 Creating the Class Student with 3 instance variables with default values.
*
*/


class  Student
{
	private String name;
	
	public void  setdata(String name)
	{
		this.name=name;
	}
	public String display()
	{
		return this.name;
	}
	 
 
	int rollno ,marks;
}