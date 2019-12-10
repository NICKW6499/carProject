package com.company;

import com.company.Chassis;
import com.company.ExteriorFeature;
import com.company.Feature;
import com.company.InteriorFeature;
import com.company.ManufacturedEngine;
import com.company.Vehicle;
import com.company.VehicleChassis;
import java.util.Date;

public class Car extends Vehicle {
  private Feature[] feature = new Feature[10];;
  private int carAxle;

  public Car() {
    super();
    Feature[] feature = {
        new InteriorFeature("No Interior Features"), new ExteriorFeature("No Exterior Features")
    };
    this.feature = feature;
    this.carAxle = 2;
  }

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
      int i) {
    super(
        vehicleManufacturedDate,
        vehicleManufacturer,
        vehicleMake,
        vehicleModel,
        vehicleType,
        vehicleFrame,
        manufacturedEngine);
    this.feature = feature;
    this.carAxle = i;
  }

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
