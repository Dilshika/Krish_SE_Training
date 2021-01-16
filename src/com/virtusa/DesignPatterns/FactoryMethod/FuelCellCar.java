package com.virtusa.DesignPatterns.FactoryMethod;

public class FuelCellCar extends CarType{
    @Override
    protected void createCar() {
        cars.add(new AudiA7hTron());
        cars.add(new AudihTron());
    }
}
