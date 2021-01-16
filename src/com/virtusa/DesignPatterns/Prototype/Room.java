package com.virtusa.DesignPatterns.Prototype;

public abstract class Room {
    private String roomPackage;
    private String roomType;
    private int roomNumber;

    public String getRoomPackage() {
        return roomPackage;
    }

    public void setRoomPackage(String roomPackage) {
        this.roomPackage = roomPackage;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomPackage='" + roomPackage + '\'' +
                ", roomType='" + roomType + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
