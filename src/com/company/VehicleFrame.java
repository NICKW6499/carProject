package com.company;

/**
 *This class uses the chassis class to create a vehicle frame object.
 * @author Nicholis Wright
 */
public class VehicleFrame implements Chassis {
  public String vehicleFrameType;

  public VehicleFrame(){
  this.vehicleFrameType="Unibody";
  }

  public VehicleFrame(String vehicleFrameType){
    this.vehicleFrameType=vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return new VehicleFrame();
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
