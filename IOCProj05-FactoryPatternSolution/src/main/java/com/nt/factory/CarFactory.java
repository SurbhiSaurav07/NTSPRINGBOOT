package com.nt.factory;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportsCar;

public class CarFactory {
		//factory method having factory pattern(logic to create and return one of several related classes obj)
		public static Car createCar(String type , String regNo) {
			
			if(type.equalsIgnoreCase("Sports"))
					return new SportsCar(regNo);
			else if(type.equalsIgnoreCase("Budget"))
				return new BudgetCar(regNo);
			else if(type.equalsIgnoreCase("Luxory"))
				return new LuxoryCar(regNo);
			else 
				throw new IllegalArgumentException("invailid Car type");
			
		}
}
