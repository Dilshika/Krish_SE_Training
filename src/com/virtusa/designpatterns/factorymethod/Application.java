package com.virtusa.designpatterns.factorymethod;

public class Application {
    public static void main(String[] args) {
        CarType type=CarFactory.createCar(CarTypeCode.ELECTRICAL);
        System.out.println(type);

        CarType type1=CarFactory.createCar(CarTypeCode.FUELCELL);
        System.out.println(type1);

        CarType type2=CarFactory.createCar(CarTypeCode.HYBRID);
        System.out.println(type2);
    }
}
