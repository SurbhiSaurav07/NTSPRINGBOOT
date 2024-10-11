package com.nt.comp;

public class Test {
	
	private int a = 10;
	private String b = "Hello";
	
	
	public Test() {
		System.out.println("Test::0-param constructor");
	}
	//same order in NewInstanceTest1 class constructor[] array
	public Test(int a, String b) {
		System.out.println("Test::2-param constructor");
		this.a = a;
		this.b =b ;
	} 
	
	//alt+shift+s ,s
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	

}
