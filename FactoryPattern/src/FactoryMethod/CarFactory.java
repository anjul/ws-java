package FactoryMethod;

import com.abstractclasses.Car;
import com.main.LuxuryCar;
import com.main.SedanCar;
import com.main.SmallCar;

import enums.CarType;

public class CarFactory {
	
	private CarFactory(){
		
	}
	
	public static Car buildCar(CarType model){
		
		Car car = null;
		
		switch(model){
		
		case SMALL:
			car = new SmallCar();
			break;
			
		case SEDAN:
			car = new SedanCar();
			break;
			
		case LUXARY:
			car = new LuxuryCar();
			break;
			
			default:
				//throw some exception
			break;
		}
		
		return car;
	}
}
