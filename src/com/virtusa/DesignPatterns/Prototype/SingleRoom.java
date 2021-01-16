package com.virtusa.DesignPatterns.Prototype;

public class SingleRoom extends Room{
    private int spentTime;   //time in hours

    public int getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    @Override
    public String toString() {
        return "SingleRoom{" +
                "spentTime='" + spentTime + '\'' +
                '}';
    }
}
