package com.nt.test;

import com.nt.comp.Test;

public class LangClassTest {
	
	public static void main(String args[]) {
		
		Class c1 = Test.class;
		Class c2 = java.util.Date.class;
		
		System.out.println("c1 object data ::" +c1);
		System.out.println("c2 object data :: " +c2);
		
	}

}
