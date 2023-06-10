package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle{

    @Override
    public String getManufacturerInformation(String vehicleType) {
        return "Bike{"+"Manufacture name:"+getVehicleName()+", Model Name: "+getVehicleModelName()+", Type: "+getVehicleType()+'}';
    }

    //parameterised constructor...super class
    public Bike(String vehicleName,String vehicleModelName,String vehicleType){
        super(vehicleName, vehicleModelName, vehicleType);
    }
    @Override
    public int maxSpeed(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("Sports Bike")){
            return 300;
        }
        else if (vehicleType.equalsIgnoreCase("Cruiser")){
            return 170;
        }
        return 0;
    }

}
