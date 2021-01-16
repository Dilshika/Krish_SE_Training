package com.virtusa.DesignPatterns.FactoryMethod;

public class ElectricalCar extends CarType{
    @Override
    protected void createCar() {
        cars.add(new AudiETron());
        cars.add(new AudiETronSportBack());
    }
}
