package main.java.com.dil.designpatterns.factorymethod;

public class HybridCar  extends CarType{
    @Override
    protected void createCar() {
            cars.add(new AudiA1());
            cars.add(new AudiA6());

    }
}
