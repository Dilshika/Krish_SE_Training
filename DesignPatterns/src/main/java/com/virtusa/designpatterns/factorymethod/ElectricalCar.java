package main.java.com.virtusa.designpatterns.factorymethod;

public class ElectricalCar extends CarType{
    @Override
    protected void createCar() {
        cars.add(new AudiETron());
        cars.add(new AudiETronSportBack());
    }
}
