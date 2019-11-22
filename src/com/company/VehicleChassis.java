package com.company;

public class VehicleChassis implements Chassis {

    public String chassisName;

    public VehicleChassis() {

        this.chassisName = Chassis.chassis;
    }

    public VehicleChassis(String chassisName) {

        this.chassisName = chassisName;
    }

    public Chassis getChassisType() {
        return new VehicleChassis();
    }

    public void setChassisType(String vehicleChassis) {

        this.chassisName = vehicleChassis;
    }

    public String toString() {

        return "Chassis Name: " + this.chassisName;
    }



}
