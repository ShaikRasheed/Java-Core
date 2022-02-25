package com.ngs.Rows30;

import java.lang.reflect.Method;

import com.ngs.Row30.AccessModifiers.*;

class Default // default access modifer.
/*
 * Whenever a specific access level is not specified, then it is assumed to be
 * ‘default’. The scope of the default level is within the package.
 */
{
	public static void main(String[] args) throws Exception {
		Default1 n = new Default1();// compile time error.
		Class c = Class.forName("Row30.Default1");
		Object o = c.newInstance(); // it returns object class object and Object
									// class is super class for all.
		// .setAccessible(true);
		// Method m1 =c.getDeclaredMethod("default1");// it is for method with
		// out parameters
		// m1.setAccessible(true);
		// System.out.println(" method"+m1+"Object"+o);

		// Method m=c.getDeclaredMethod("display",int.class,String.class); // it
		// is for method with parameters
		// m.setAccessible(true); // it is used for accessing the object.

		// System.out.println(int.class+" method"+m);

	}

}
