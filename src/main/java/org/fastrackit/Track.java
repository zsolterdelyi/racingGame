package org.fastrackit;

public class Track {


    private String name;
    private double lenght;



    // contructor- olvass utanna, fontos

    public Track(String name, double lenght) {
        this.name = name;
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }


    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", lenght=" + lenght +
                '}';
    }
}
