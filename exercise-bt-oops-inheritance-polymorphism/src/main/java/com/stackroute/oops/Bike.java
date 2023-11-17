package com.stackroute.oops;

public class Bike extends AbstractManufacturer implements Vehicle {
    public Bike(String name, String modelName, String bikeType) {
    	super(name,modelName,bikeType);
    }

    /*
   Method returns maximum speed depending upon their types
   For Sports-300kmh
   For cruiser-170kmh
    */
    @Override
    public int maxSpeed(String bikeType) {
    	int maxSpeed = 0;
        if(bikeType.equalsIgnoreCase("Sports")) {
        	maxSpeed = 300;
        }else if(bikeType.equalsIgnoreCase("Cruiser")) {
        	maxSpeed = 170;
        }
        return maxSpeed;
    }

    /*
    should return in the format : Bike{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
    	return "Bike{Manufacturer name:"+super.getName()+",Model Name:"+super.getModelName()+",Type:"+super.getType()+"}";
    }
}
