package com.vehicles;

public class Car extends VehicleManufacturer{
    public Car(String vehicleName,String vehicleModelName,String vehicleType){
        super(vehicleName, vehicleModelName, vehicleType);
    }

    public int maxSpeed(String vehicleType){
        if(getVehicleType().equals("sportsCar")){
            return 250;
        } else if (getVehicleType().equals("sedan")) {
            return 170;

        }
        return 0;
    }
    public String getManufacturerInformation(){
        return "Car{Manufacturer name: "+getVehicleName()+" ,Model Name: "+getVehicleModelName()+" ,Type; "+getVehicleType()+"}";
    }


}
