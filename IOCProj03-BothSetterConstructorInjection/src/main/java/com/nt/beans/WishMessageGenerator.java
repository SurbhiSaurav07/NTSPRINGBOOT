package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//HAS_A property (composition)
	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	
	
	//constructor Injection
	public WishMessageGenerator(Date dat) {
		System.out.println("WishMessageGenerator::1-param constructor");
		this.date = dat;
	}
	
	/*//private constructor Injection   happay use but not good practice
		private WishMessageGenerator(Date dat) {
			System.out.println("WishMessageGenerator::1-param constructor");
			this.date = dat;
		}*/
		
	//setter method supporting setter injection
		public void setDate1(Date date) {
			System.out.println("WishMessageGenerator.setDate()");
			this.date = date;
		} 
		
	//b.logic
	public String GenerateMessage(String user) {
		System.out.println("WishMessageGenerator.GenerateMessage() ::"+date);
		//get current of day
		int hour = date.getHours();
		if(hour <12)
			return "GM :" + user ;
		else if(hour<16)
			return "GA : " + user ;
		else if(hour<20)
			return "GE :" + user ;
		else
			return "GN : " + user;
	}

}
