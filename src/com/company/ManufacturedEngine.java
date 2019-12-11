package com.company;

import java.util.Date;

/**
 *This class creates a manufactured engine based on the engine interface.
 * @author Nicholis Wright
 */
public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  /**
   *This is the default constructor for an engine.
   * @author Nicholis Wright
   */
  public ManufacturedEngine() {

    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "Generic";
    this.driveTrain = "2WD: Two-Wheel Drive";
  }

  /**
   * This is an overloaded constructor for an engine with unique field values.
   * @author Nicholis Wright
   * @param engineManufacturer Engine manufacturer
   * @param engineManufacturedDate Date engine was made
   * @param engineMake Make of engine e.g Honda
   * @param engineModel Model of engine
   * @param engineType Type of engine
   * @param engineCylinders # of cylinders in the engine
   * @param driveTrain Drive train of the vehicle
   */
  public ManufacturedEngine(
      String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      String engineType,
      int engineCylinders,
      String driveTrain) {

    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  /**
   *This is a method to return values of an engine in a string format.
   * @author Nicholis Wright
   * @return returns a String of engine values.
   */
  public String toString() {

    return "Engine Manufacturer : "
        + engineManufacturer
        + "\n"
        + "Engine Manufactured : "
        + engineManufacturedDate
        + "\n"
        + "Engine Make         : "
        + engineMake
        + "\n"
        + "Engine Model        : "
        + engineModel
        + "\n"
        + "Engine Type         : "
        + engineType
        + "\n"
        + "Engine Cylinders    : "
        + engineCylinders
        + "\n"
        + "Drive Train         : "
        + driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  public String getEngineManufacturer() {
    return engineManufacturer;
  }

  public Date getEngineManufacturedDate() {
    return engineManufacturedDate;
  }

  public String getEngineMake() {
    return engineMake;
  }

  public String getEngineModel() {
    return engineModel;
  }

  public int getEngineCylinders() {
    return engineCylinders;
  }

  public String getEngineType() {
    return engineType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }
}
