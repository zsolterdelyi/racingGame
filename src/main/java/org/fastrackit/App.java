package org.fastrackit;

import com.sun.tools.internal.xjc.model.CArrayInfo;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
//// comment instructions
//
    {
//     Car firstCompetitor = new Car(new Engine());
//     firstCompetitor.setName("Dacioa");
//     firstCompetitor.setColor("black");
//     firstCompetitor.setMileage(9.5);
//
//
//     // second init cars
//
//     Car secondCompetitor = new Car(new Engine());
//     secondCompetitor.setName("masina");
//
//
//     Engine firstEngine = new Engine();
//
//     firstEngine.manufacturer = "Renault";
//
//     System.out.println(firstEngine.manufacturer);
//
//
//     firstCompetitor.engine = firstEngine;
//
//     firstCompetitor.engine.manufacturer = "BMW";
//
//    // firstCompetitor = null;
//
//
//     System.out.println(firstEngine.manufacturer);
//     System.out.println(firstCompetitor.engine.manufacturer);
//
//
//     Engine testEngine = null;
//
//     System.out.println(testEngine);
//
//
//     double travDist = firstCompetitor.accelerate( 100, 4.5);
//     System.out.println( "distanta " + travDist);

     Vehicle vehicle = new Vehicle();
     vehicle.applicationTotalNUmberOfVehicles = 1;

        System.out.println("total from vehicle 1" + 1);

     Vehicle vehicle2 = new Vehicle();





     Vehicle.applicationTotalNUmberOfVehicles = 23;

        System.out.println("total from veh 2" + vehicle.applicationTotalNUmberOfVehicles);

 }
}