package com.demo;

public class Car {

    private Transmission transmission;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;

    }

    public void start(){
        engine.start();
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
