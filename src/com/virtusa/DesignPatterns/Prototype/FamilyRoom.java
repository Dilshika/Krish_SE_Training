package com.virtusa.DesignPatterns.Prototype;

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
