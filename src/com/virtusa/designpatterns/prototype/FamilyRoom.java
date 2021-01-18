package com.virtusa.designpatterns.prototype;

public class FamilyRoom extends Room{
    private int numberOfBeds;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public String toString() {
        return "FamilyRoom{" +
                "numberOfBeds='" + numberOfBeds + '\'' +
                '}';
    }
}
