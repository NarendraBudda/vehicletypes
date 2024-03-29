package com.vehicles;

public abstract class VehicleManufacturer {
    private String vehicleName;
    private  String vehicleModelName;
    private String vehicleType;

    public VehicleManufacturer(String vehicleName,String vehicleModelName,String vehicleType){
    this.vehicleName=vehicleName;
    this.vehicleModelName=vehicleModelName;
    this.vehicleType=vehicleType;
    }

    public void setVehicleName(String vehicleName){
        this.vehicleName=vehicleName;
    }
    public String getVehicleName(){
        return vehicleName;
    }
    public void setVehicleModelName(String vehicleModelName){
        this.vehicleModelName=vehicleModelName;
    }
    public String getVehicleModelName(){
        return vehicleModelName;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }
    public String getVehicleType(){
        return vehicleType;
    }
    public abstract String getManufacturerInformation();
}
