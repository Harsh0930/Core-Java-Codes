package com.vehicles;

public abstract class VehicleManufacturer {

    private String vehicleName;
    private String vehicleModelName;
    private String vehicleType;

    //no-argument constructor...
    public VehicleManufacturer(){
        this.vehicleName="BMW x5";
        this.vehicleType="Car";
        this.vehicleModelName="AMG Edition";
    }

    //parameterised constructor for VehicleManufacturer...
    public VehicleManufacturer(String vehicleName,String vehicleModelName,String vehicleType){
        this.vehicleName=vehicleName;
        this.vehicleModelName=vehicleModelName;
        this.vehicleType=vehicleType;
    }

    //getter methods...
    public String getVehicleName(){
        return vehicleName;
    }
    public String getVehicleModelName(){
        return vehicleModelName;
    }
    public String getVehicleType(){
        return vehicleType;
    }

    //setter methods...
    public void setVehicleName(String vehicleName){
        this.vehicleName=vehicleName;
    }
    public  void setVehicleModelName(String vehicleModelName){
        this.vehicleModelName=vehicleModelName;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }

    //abstract method...
    public abstract String getManufacturerInformation(String vehicleType);
}
