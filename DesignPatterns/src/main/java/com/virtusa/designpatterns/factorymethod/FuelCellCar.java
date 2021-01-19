package main.java.com.virtusa.designpatterns.factorymethod;

public class FuelCellCar extends CarType{
    @Override
    protected void createCar() {
        cars.add(new AudiA7hTron());
        cars.add(new AudihTron());
    }
}
