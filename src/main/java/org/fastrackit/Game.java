package org.fastrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    // muszaly a sor fix osszege, kitolteni kotelezo
    private Track[] tracks = new Track[10];

    // implements vs extend
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() throws Exception {

        addCompetitors(2);
        displayCompetitors();
        addTrack(0, new Track("Highway", 300));
        addTrack(1, new Track("Desert", 230));

        //- sajat szar

        getTrackNumber();

        //  displayAvailableTracks();


        int trackNumber = getTrackNumberFromUser();
        Track track = tracks[trackNumber - 1];
        System.out.println("Chosen track: " + track.getName());

        {


        }

        // Track track = getTrackNumber();

    }

    private int getTrackNumberFromUser() throws Exception {

        System.out.println("Chose a track: ");
        Scanner scanner = new Scanner(System.in);

        try {

            return scanner.nextInt();
        } catch (InputMismatchException exception) {

            //       throw new Exception ("Expected integer.");
            System.out.println("Expected integer.");
            return getTrackNumberFromUser();

        } finally {
            System.out.println("ceva");
        }


    }




    private void getTrackFromUser() {

        System.out.println();
    }


    public void showChosedTrack () {

   //     System.out.println(tracks.);


    }


    public  void addCompetitors (int cometitorCount) {

        for (int i = 0; i < cometitorCount; i++) {

            Vehicle vehicle = new Vehicle();
            // vevicle details will be populated when we learn to get user's imput

            String name = getVehicleNameFromUser();
            vehicle.setName(name);

            double milage = ThreadLocalRandom.current().nextDouble(5,15);
            vehicle.setMileage(milage);
            System.out.println("Your milage is: " + milage);



            competitors.add(vehicle);
        }

    }


    private String getVehicleNameFromUser () {

        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your vehicle name is: " + name);
        return name;

    }

    private  int getTrackNumber () {
        System.out.println("Please choose track nr: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
   //     String trackName =;
        System.out.println("Your track is: " + number);
        return number;


    }




    private double gteVehicleAccelerationSpeedFromUser () {

        System.out.println("Please enter acceleration speed :");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();


    }




    public void displayCompetitors () {

        System.out.println( "Welcome! Race is starting: ");

        for (int i =0; i < competitors.size(); i++) {

            if (competitors.get(i) != null) {
                System.out.println(competitors.get(i).getName());
            }

        }

    }

    public void addTrack (int index, Track track) {

        tracks [index] = track;




    }

    public void displayAvailableTracks() {

        System.out.println("Available tracks: ");
        System.out.println(tracks [0]);
        System.out.println(tracks[1]);



        for (int i= 0; i < tracks.length; i++){

            if (tracks[i] != null) {

                System.out.println(tracks[i].getName());
            }
        }
        for (Track track : tracks) {

            if (track != null) {
                System.out.println(track.getName());

            }

        }


    }

}
