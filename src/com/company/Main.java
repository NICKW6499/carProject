package com.company;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {

  public static void main(String[] args) {
    VehicleChassis myCar = new VehicleChassis();
    VehicleChassis myCar1 = new VehicleChassis("potato");
    System.out.println(myCar);
    System.out.println(myCar1);

    vehicleFrame car = new vehicleFrame();
    vehicleFrame car1 = new vehicleFrame("dolo");
    System.out.println(car);
    System.out.println(car1);

    ManufacturedEngine myEngine = new ManufacturedEngine();
    ManufacturedEngine myEngine1 = new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1", "88 AKI", 4, "2WD: Two_Wheel Drive");
    System.out.println(myEngine);
    System.out.println(myEngine1);

    InteriorFeature myFeature = new InteriorFeature();
    InteriorFeature myFeature1 = new InteriorFeature("Climate Control");
    System.out.println(myFeature);
    System.out.println(myFeature1);

    ExteriorFeature myFeature2 = new ExteriorFeature();
    ExteriorFeature myFeature3 = new ExteriorFeature("Fog Lamps");
    System.out.println(myFeature2);
    System.out.println(myFeature3);

  }
}
