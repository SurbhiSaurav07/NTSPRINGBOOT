package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class BusinessManCustomer3 {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("Luxory" , "TS11Ab 512");
		car.drive();

	}

}
