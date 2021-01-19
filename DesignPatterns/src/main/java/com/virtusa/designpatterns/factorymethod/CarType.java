package main.java.com.virtusa.designpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CarType {
    protected List<Car> cars=new ArrayList<>();

    public CarType(){
        createCar();
    }

    protected abstract void createCar();

    @Override
    public String toString() {
        return "CarType{" +
                "cars=" + cars +
                '}';
    }
}
