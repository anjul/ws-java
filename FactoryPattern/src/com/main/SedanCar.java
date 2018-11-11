package com.main;

import com.abstractclasses.Car;

import enums.CarType;

public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);

		construct();
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub

	}

}
