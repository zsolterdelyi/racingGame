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

    private double fuelLevel = 70;

    public double accelerate (double speed, double durationInHours) {

        System.out.println(name + " accelerated with" + speed + "km/h for" + durationInHours + "hours.");

        double distance = speed * durationInHours;
        System.out.println( "Treveled distance " + distance + " km");


        // unreacable statement : is after return !!!!!!    return distance;



        double spentFuel = distance * mileage / 100;

        fuelLevel -= spentFuel;

        System.out.println( "Remaining fuel: " + fuelLevel);

        totalKm += distance;

        System.out.println("Total traveled distance: " + totalKm);



        return distance;

    }

    //co-variant return type
    public Vehicle returnSomeVehicle() {
        return this;
    }






//method overloading
    public double accelerate (double speed) {

        return accelerate (speed,1);
    }}


