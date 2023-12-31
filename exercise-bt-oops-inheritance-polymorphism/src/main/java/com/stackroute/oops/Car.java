package com.stackroute.oops;

public class Car extends AbstractManufacturer implements Vehicle {
	
	
	
    public Car(String name, String modelName, String carType) {
    	super(name,modelName,carType);
    }

    /*
    Method returns maximum speed depending upon their types
    For sports-250kmh
    For sedan-190kmh
     */
    @Override
    public int maxSpeed(String carType) {
    	int maxSpeed = 0;
        if(carType.equalsIgnoreCase("Sports")) {
        	maxSpeed = 250;
        }else if(carType.equalsIgnoreCase("Sedan")) {
        	maxSpeed = 190;
        }
        return maxSpeed;
    }

   
    /*
    should return in the format : Car{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
    	return "Car{Manufacturer name:"+super.getName()+",Model Name:"+super.getModelName()+",Type:"+super.getType()+"}";
    }
}
