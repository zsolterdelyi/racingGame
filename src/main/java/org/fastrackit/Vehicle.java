package org.fastrackit;

public class Vehicle {

    String name;
    String color;
    double mileage;
    Engine engine;
    long totalKm;


    public double accelerate (double speed, double durationInHours) {

        System.out.println(name + " accelerated with" + speed + "km/h for" + durationInHours + "hours.");

        double distance = speed * durationInHours;
        System.out.println( "Treveled distance " + distance + " km");
        return distance;
    }




}
