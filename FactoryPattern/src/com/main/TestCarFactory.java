package com.main;

import FactoryMethod.CarFactory;
import enums.CarType;

public class TestCarFactory {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.LUXARY));
		CarFactory.buildCar(CarType.SEDAN);
		CarFactory.buildCar(CarType.SMALL);
	}

}
