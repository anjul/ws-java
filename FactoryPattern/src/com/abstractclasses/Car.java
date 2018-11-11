package com.abstractclasses;

import enums.CarType;

public abstract class Car {
	
	private CarType model = null;
	
	public Car(CarType model){
		
		this.model = model;
		arrangeParts();
	}

	private void arrangeParts() {
		// TODO Auto-generated method stub
		
	}
	
	public CarType getModel(){
		return model;
	}
	
	public void setModel(CarType model){
		model = this.model;
	}
	
	protected abstract void construct();

}
