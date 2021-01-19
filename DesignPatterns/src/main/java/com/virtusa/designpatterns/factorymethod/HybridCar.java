package main.java.com.virtusa.designpatterns.factorymethod;

public class HybridCar  extends CarType{
    @Override
    protected void createCar() {
            cars.add(new AudiA1());
            cars.add(new AudiA6());

    }
}
