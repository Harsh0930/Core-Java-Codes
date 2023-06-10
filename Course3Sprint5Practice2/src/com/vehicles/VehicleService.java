package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        //object for Bike class...
        Bike bike=new Bike("Ninja H2","Kawasaki Sports Edition","Cruiser");
        System.out.println("Bike Type is "+bike.getVehicleType()+" its speed is "+bike.maxSpeed(bike.getVehicleType()));
        System.out.println(bike.getManufacturerInformation(bike.getVehicleType()));

        System.out.println("------------------------------------------------------------------------------------");

        //object for Car class...
        Car car1=new Car("BMW","BMW AMG Edition","Sports car");
        System.out.println("Car type is "+ car1.getVehicleType()+" its speed is "+ car1.maxSpeed(car1.getVehicleType()));
        System.out.println(car1.getManufacturerInformation(car1.getVehicleType()));


    }
}
