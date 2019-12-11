package com.company;

import java.util.Date;

/**
 * This class creates a vehicle using ManufacturedEngine, Chassis, and Date classes.
 * @author Nicholis Wright
 */
public class Vehicle {
  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private ManufacturedEngine vehicleEngine;

  /**
   *This is the default constructor for a vehicle.
   */
  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleChassis();
    this.vehicleType = "Generic";
    this.driveTrain = "Generic";
    this.vehicleEngine = new ManufacturedEngine();
  }

  /**
   *This is the overloaded constructor for a vehicle.
   * @author Nicholis Wright
   * @param vehicleManufacturedDate Date manufactured
   * @param vehicleManufacturer Vehicle Manufacturer
   * @param vehicleMake Vehicle Make
   * @param vehicleModel Vehicle Model
   * @param vehicleType Vehicle Type
   * @param vehicleFrame Vehicle Frame attributes
   * @param vehicleEngine Vehicle engine attributes
   */
  public Vehicle(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      String vehicleType,
      Chassis vehicleFrame,
      ManufacturedEngine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = vehicleEngine.getDriveTrain();
    this.vehicleEngine = vehicleEngine;
  }

  /**
   *This is the overloaded constructor for a vehicle.
   * @author Nicholis Wright
   * @param vehicleManufacturedDate Date manufactured
   * @param vehicleManufacturer Vehicle Manufacturer
   * @param vehicleMake Vehicle Make
   * @param vehicleModel Vehicle Model
   * @param vehicleType Vehicle Type
   * @param vehicleFrame Vehicle Frame attributes
   * @param manufacturedEngine Vehicle engine attributes
   */
  public Vehicle(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      VehicleChassis vehicleFrame,
      String vehicleType,
      String type,
      ManufacturedEngine manufacturedEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = type;
    this.vehicleEngine = manufacturedEngine;
  }

  /**
   * This is a method that will return a string containing vehicle attributes.
   * @return
   */
  public String toString() {
    return "Manufacturer Name: "
        + getVehicleManufacturer()
        + "\n"
        + "Manufactured Date: "
        + getVehicleManufacturedDate()
        + "\n"
        + "Vehicle Make: "
        + getVehicleMake()
        + "\n"
        + "Vehicle Model: "
        + getVehicleModel()
        + "\n"
        + "Vehicle Type: "
        + getVehicleType()
        + "\n"
        + "Engine Manufacturer: "
        + vehicleEngine.getEngineManufacturer()
        + "\n"
        + "Engine Manufactured: "
        + vehicleEngine.getEngineManufacturedDate()
        + "\n"
        + "Engine Make: "
        + vehicleEngine.getEngineMake()
        + "\n"
        + "Engine Model: "
        + vehicleEngine.getEngineModel()
        + "\n"
        + "Engine Type: "
        + vehicleEngine.getEngineType()
        + "\n"
        + "Engine Cylinders: "
        + vehicleEngine.getEngineCylinders()
        + "\n"
        + "Drive Train: "
        + driveTrain
        + "\n";
  }

  public Date getVehicleManufacturedDate() {
    return vehicleManufacturedDate;
  }

  public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
  }

  public String getVehicleManufacturer() {
    return vehicleManufacturer;
  }

  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public String getVehicleMake() {
    return vehicleMake;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public String getVehicleModel() {
    return vehicleModel;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public Chassis getVehicleFrame() {
    return vehicleFrame;
  }

  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  public ManufacturedEngine getVehicleEngine() {
    return vehicleEngine;
  }

  public void setVehicleEngine(ManufacturedEngine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }
}
