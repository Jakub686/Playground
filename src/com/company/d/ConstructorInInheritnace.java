package com.company.d;

import com.sun.xml.internal.ws.api.pipe.Engine;




class Vehicle {
    private int numberOfWheels;
    private Engine engine;

    public Vehicle(Engine engine, int numberOfWheels) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
    }
}

class Car extends Vehicle {
    private static final int NUMBER_OF_WHEELS = 4;

    public Car(Engine engine) {
        super(engine, NUMBER_OF_WHEELS);
    }
}

