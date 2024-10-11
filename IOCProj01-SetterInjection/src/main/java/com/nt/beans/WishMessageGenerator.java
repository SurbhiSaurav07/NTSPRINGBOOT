package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//HAS_A property (composition)
	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	
	//setter method supporting setter injection
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	//b.logic
	public String GenerateMessage(String user) {
		System.out.println("WishMessageGenerator.GenerateMessage()");
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
