package com.virtusa.designpatterns.factorymethod;

public class CarFactory {
    public static CarType createCar(CarTypeCode typeCode){
        switch (typeCode){
            case HYBRID:
                return new HybridCar();
            case FUELCELL:
                return  new FuelCellCar();
            case ELECTRICAL:
                return new ElectricalCar();
            default:
                return null;
        }

    }
}
