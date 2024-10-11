package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class ProfetionalCustomer1 {

	public static void main(String[] args) {
		
		Car car = CarFactory.createCar("Budget" , "TS09EN 564");
		car.drive();

	}

}
