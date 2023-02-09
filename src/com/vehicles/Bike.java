package com.vehicles;

public class Bike extends VehicleManufacturer{

    public Bike(String vehicleName,String vehicleModelName,String vehicleType){
        super(vehicleName, vehicleModelName, vehicleType);
    }
    public int maxSpeed(String vehicleType){
        if(super.getVehicleType().equals("sportsBike")){
            return 250;
        } else if (super.getVehicleType().equals("cruiser")) {
            return 170;

        }
        return 0;
    }


    @Override
    public String getManufacturerInformation() {
        return "Bike{Manufacturer name: "+getVehicleName()+" ,Model Name: "+getVehicleModelName()+" ,Type; "+getVehicleType()+"}";
    }
}
