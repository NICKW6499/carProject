package com.company;

import com.company.Chassis;
import com.company.ExteriorFeature;
import com.company.Feature;
import com.company.InteriorFeature;
import com.company.ManufacturedEngine;
import com.company.Vehicle;
import com.company.VehicleChassis;
import java.util.Date;

/**
 * This class constructs a car with attributes from the Vehicle class
 * @author Nicholis Wright
 */
public class Car extends Vehicle {
  private Feature[] feature = new Feature[10];;
  private int carAxle;

  /**
   * Default Car constructor
   * @author Nicholis Wright
   */
  public Car() {
    super();
    Feature[] feature = {
        new InteriorFeature("No Interior Features"), new ExteriorFeature("No Exterior Features")
    };
    this.feature = feature;
    this.carAxle = 2;
  }

  /**
   *This is an overloaded car constructor to take in unique values.
   * @author Nicholis Wright
   * @param vehicleManufacturer Vehicle manufacturer
   * @param vehicleManufacturedDate Date manufactured
   * @param vehicleMake Make of vehicle
   * @param vehicleModel Vehicle model
   * @param vehicleType Type of vehicle
   * @param vehicleFrame Frame type of vehicle
   * @param vehicleEngine Type of engine in vehicle
   * @param feature Vehicle features
   * @param carAxle # of axles
   */
  public Car(
      String vehicleManufacturer,
      Date vehicleManufacturedDate,
      String vehicleMake,
      String vehicleModel,
      String vehicleType,
      Chassis vehicleFrame,
      ManufacturedEngine vehicleEngine,
      Feature[] feature,
      int carAxle) {
    super(
        vehicleManufacturedDate,
        vehicleManufacturer,
        vehicleMake,
        vehicleModel,
        vehicleType,
        vehicleFrame,
        vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  /**
   *This is an overloaded car constructor to take in unique values.
   * @author Nicholis Wright
   * @param vehicleManufacturer Vehicle manufacturer
   * @param vehicleManufacturedDate Date manufactured
   * @param vehicleMake Make of vehicle
   * @param vehicleModel Vehicle model
   * @param vehicleType Type of vehicle
   * @param type Type of engine
   * @param manufacturedEngine Engine in vehicle
   * @param feature features of vehicle
   * @param carAxle # of axles
   */
  public Car(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      VehicleChassis vehicleFrame,
      String vehicleType,
      String type,
      ManufacturedEngine manufacturedEngine,
      Feature[] feature,
      int carAxle) {
    super(
        vehicleManufacturedDate,
        vehicleManufacturer,
        vehicleMake,
        vehicleModel,
        vehicleType,
        vehicleFrame,
        manufacturedEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  /**
   *This method loops through a list of features for a car
   * @author Nicholis Wright (Stack overflow assisted with logic examples)
   * @return A list of features
   */
  public String getExteriorFeatures() {

    String list = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof ExteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += ": " + this.feature[i];
        }
      }
    }
    return list;
  }

  /**
   *This method loops through a list of features for a car
   * @author Nicholis Wright (Stack overflow assisted with logic examples)
   * @return A list of features
   */
  public String getInteriorFeatures() {
    String list = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof InteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n : " + this.feature[i];
        }
      }
    }
    return list;
  }

  /**
   * This method returns string values for car attributes.
   * @author Nicholis Wright
   * @return
   */
  public String toString() {
    String list = "";

    for (int i = 0; i < this.feature.length; i++) {
      if (list.length() == 0) {
        list += this.feature[i];
      } else {
        list += "\n " + this.feature[i];
      }
    }
    return super.toString()
        + "\n"
        + "Features: \n "
        + list
        + "\n"
        + "Car Axle: "
        + carAxle;
  }
}
