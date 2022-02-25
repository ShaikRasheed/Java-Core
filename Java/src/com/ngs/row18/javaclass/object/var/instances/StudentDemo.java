package com.ngs.row18.javaclass.object.var.instances;

/*
* This is the main class for Student class
*
*/

class StudentDemo extends Student
{
	public static void main(String[] args)
	{
		Student student = new Student();
		
		//st.name = "Rasheed";
		//System.out.println(st.name);
		
		student.rollno=198;
		System.out.println(student.rollno);
		
		student.marks=98;
		System.out.println(student.marks);
		
		// Here setting the private member value.
		student.setdata("Apple");
		 
		// Here we are display the getter value.
		System.out.println(student.display());
		 
	}
}