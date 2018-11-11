package com.main;

import com.abstractclasses.Car;

import enums.CarType;

public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SMALL);
		
		construct();
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub

	}

}
