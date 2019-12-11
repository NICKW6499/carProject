package com.company;

/**
 * @author Nicholis Wright
 * This class sets the interior features of a car.
 */
public class InteriorFeature implements Feature{
  private String interiorFeature;

  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String getFeature() {
    return interiorFeature;
  }

  public void setFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String  toString(){
    return "Interior [" + this.interiorFeature + "]";
  }
}
