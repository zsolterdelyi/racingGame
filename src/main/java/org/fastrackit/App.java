package org.fastrackit;

import com.sun.tools.internal.xjc.model.CArrayInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
// comment instructions
 {
     Car firstCompetitor = new Car();
     firstCompetitor.name = "Dacia";
     firstCompetitor.color = "black";
     firstCompetitor.doorCount = 5;
     firstCompetitor.mileage = 9.5;


     // second init cars

     Car secondCompetitor = new Car();
     secondCompetitor.name = "masina";


     Engine firstEngine = new Engine();

     firstEngine.manufacturer = "Renault";

     System.out.println(firstEngine.manufacturer);


     firstCompetitor.engine = firstEngine;

     firstCompetitor.engine.manufacturer = "BMW";

    // firstCompetitor = null;


     System.out.println(firstEngine.manufacturer);
     System.out.println(firstCompetitor.engine.manufacturer);


     Engine testEngine = null;

     System.out.println(testEngine);


     double travDist = firstCompetitor.accelerate( 100, 4.5);
     System.out.println( "distanta " + travDist);

 }

}