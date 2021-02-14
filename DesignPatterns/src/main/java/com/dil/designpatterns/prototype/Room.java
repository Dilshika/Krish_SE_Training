package main.java.com.dil.designpatterns.prototype;

public abstract class Room implements Cloneable{

    private String roomPackage;
    private int roomNumber;

    public String getRoomPackage() {
        return roomPackage;
    }

    public void setRoomPackage(String roomType) {
        this.roomPackage = roomType;
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
                "roomType='" + roomPackage + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
