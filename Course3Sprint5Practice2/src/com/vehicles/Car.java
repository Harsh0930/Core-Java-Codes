package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle{


    //parameterised constructor...super class
    public Car(String vehicleName,String vehicleModelName,String vehicleType){
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("Sports Car")){
            return 250;
        }
        else if (vehicleType.equalsIgnoreCase("Sedan")){
            return 170;
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation(String vehicleType) {
        return "Car{"+"Manufacture name:"+getVehicleName()+", Model Name: "+getVehicleModelName()+", Type: "+getVehicleType()+'}';
    }
}
