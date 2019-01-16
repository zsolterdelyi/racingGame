package org.fastrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    // muszaly a sor fix osszege, kitolteni kotelezo
    private Track[] tracks = new Track[10];

    // implements vs extend
    private List<Vehicle> competitors = new ArrayList<>();

    public  void addCompetitors (int cometitorCount) {

        for (int i = 0; i < cometitorCount; i++) {

            Vehicle vehicle = new Vehicle();
            // vevicle details will be populated when we learn to get user's imput
            competitors.add(vehicle);
        }

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
      //  System.out.println(tracks [0]);
      //  System.out.println(tracks[1]);



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
