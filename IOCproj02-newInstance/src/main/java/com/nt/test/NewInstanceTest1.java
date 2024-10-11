//client app 
package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceTest1 {

	public static void main(String[] args) throws Exception{
		
		// loading the class at runtime
		Class c1 = Class.forName(args[0]);
		//Class c2 = Class.forName(args[1]);
		
		//get all constructor of the loaded class
	 Constructor cons[] = c1.getDeclaredConstructors();
	 
	 //Dynamic object using 0-param constructor
	 Object obj1 = cons[0].newInstance();
	 System.out.println(obj1);
	 System.out.println("-----------");
	 
	//Dynamic object using 2-param constructor
		 Object obj2 = cons[1].newInstance(100,"india");
		 System.out.println(obj2);
		

	}

}
