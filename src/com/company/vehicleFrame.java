package com.company;

public class vehicleFrame implements Chassis {
  public String vehicleFrameType;

  vehicleFrame(){
  this.vehicleFrameType="Unibody";
  }

  vehicleFrame(String vehicleFrameType){
    this.vehicleFrameType=vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return new vehicleFrame();
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrameType=vehicleChassis;
  }

  @Override
  public String toString() {
    return "Chassis: " +  chassis + "\n" + "Vehicle Frame: " + vehicleFrameType;
  }
}
