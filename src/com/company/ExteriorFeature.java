package com.company;

public class ExteriorFeature {
  private String exteriorFeature;

  ExteriorFeature(){
    this.exteriorFeature="Generic";
  }

  ExteriorFeature(String exteriorFeature){
    this.exteriorFeature=exteriorFeature;
  }

  public String getFeature(){
    return exteriorFeature;
  }

  public void setFeature(String exteriorFeature){
    this.exteriorFeature=exteriorFeature;
  }

  public String toString(){
    return "Exterior [" + exteriorFeature + "]";
  }





}
