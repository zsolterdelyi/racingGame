package org.fastrackit;

public class AutoVehicle extends Vehicle {

    private Engine engine;
    private boolean running;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
// constructor overloading
    public AutoVehicle () {
      this (new Engine());
    }


    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
