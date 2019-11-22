package com.company;

public class InteriorFeature {
  private String interiorFeature;

  InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  InteriorFeature(String interiorFeature) {
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
