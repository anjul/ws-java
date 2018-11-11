package com.main;

import com.abstractclasses.Car;

import enums.CarType;

public class LuxuryCar extends Car {

	public LuxuryCar(){
		super(CarType.LUXARY);
		
		construct();
		
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		
	}
}
