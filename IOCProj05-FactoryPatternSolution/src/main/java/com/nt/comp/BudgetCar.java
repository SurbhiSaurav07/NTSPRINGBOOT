package com.nt.comp;

public class BudgetCar extends Car{
	
	private String regNo;
	
	public BudgetCar(String regNo) {
		System.out.println("BudgetCar::1-param constructor");
		System.out.println(regNo);
		this.regNo = regNo;
		
	}

	@Override
	public void drive() {
		System.out.println("Driving BudgetCar with reg No ::"+regNo);
		
	}

}
