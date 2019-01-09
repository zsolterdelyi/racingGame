package org.fastrackit.cheater;

import org.fastrackit.AutoVehicle;
import org.fastrackit.Car;
import org.fastrackit.Vehicle;

public class CheatingCar extends Vehicle {



    @Override
    public double accelerate(double speed, double durationInHours) {



        return super.accelerate(2 * speed, durationInHours);

    }

// co-variant return type
    @Override
    public AutoVehicle returnSomeVehicle() {
        return new AutoVehicle();
    }
}
