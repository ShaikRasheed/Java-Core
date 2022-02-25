package com.ngs.Row30.AccessModifiers;

//The private access modifier is accessible only within the class.
import java.lang.reflect.Method;

public class Methodcall {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("Row30.A"); // return the class object
		Object o = c.newInstance(); // it returns object class object and Object
									// class is super class for all.
		Method m1 = c.getDeclaredMethod("show", null);// it is for method with
														// out parameters
		System.out.println(" method" + m1 + "Object" + o);

		Method m = c.getDeclaredMethod("display", int.class, String.class); // it
																			// is
																			// for
																			// method
																			// with
																			// parameters
		m.setAccessible(true); // it is used for accessing the object.

		System.out.println(int.class + " method" + m);
		m.invoke(o, 3, "Rasheed"); // it is used for invoking or calling the
									// object.
		m1.setAccessible(true);// Here we are giving particular method object
								// accessing
		m1.invoke(o);

	}
}
/*
 * class A{ private int data=40; private void
 * msg(){System.out.println("Hello java");} }
 * 
 * public class Simple{ public static void main(String args[]){ A obj=new A();
 * System.out.println(obj.data);//Compile Time Error obj.msg();//Compile Time
 * Error } }
 */
