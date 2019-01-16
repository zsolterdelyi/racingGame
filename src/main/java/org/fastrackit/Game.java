package org.fastrackit;

public class Game {

    // muszaly a sor fix osszege, kitolteni kotelezo
    private Track[] tracks = new Track[10];

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
