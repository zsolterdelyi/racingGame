package org.fastrackit;

public class Vehicle {


    public static int applicationTotalNUmberOfVehicles;

   private String name;
   private String color;
   private double mileage;
   private Engine engine;
   private long totalKm;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public long getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(long totalKm) {
        this.totalKm = totalKm;
    }

    public double accelerate (double speed, double durationInHours) {

        System.out.println(name + " accelerated with" + speed + "km/h for" + durationInHours + "hours.");

        double distance = speed * durationInHours;
        System.out.println( "Treveled distance " + distance + " km");
        return distance;





    }




}
