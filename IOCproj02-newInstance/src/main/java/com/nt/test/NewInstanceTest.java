//client app 
package com.nt.test;

public class NewInstanceTest {

	public static void main(String[] args) throws Exception{
		
		// loading the class at runtime
		Class c1 = Class.forName(args[0]);
		Class c2 = Class.forName(args[1]);
		
		//create the objects loaded class
		Object obj1 = c1.newInstance();
		Object obj2 = c2.newInstance();
		
		System.out.println(obj1.toString()); 
		System.out.println(obj2.toString());

	}

}
