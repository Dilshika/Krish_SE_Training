package com.virtusa.DesignPatterns.FactoryMethod;

public class HybridCar  extends CarType{
    @Override
    protected void createCar() {
            cars.add(new AudiA1());
            cars.add(new AudiA6());

    }
}
