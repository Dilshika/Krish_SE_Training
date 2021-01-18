package com.virtusa.designpatterns.prototype;

public class Application {
    public static void main(String[] args) {

        RoomRegistry roomRegistry=new RoomRegistry();

        FamilyRoom familyRoom= (FamilyRoom) roomRegistry.getRoom(RoomType.FAMILY);
        System.out.println(familyRoom);

        familyRoom.setNumberOfBeds(2);

        System.out.println(familyRoom);


        FamilyRoom familyRoom1=(FamilyRoom) roomRegistry.getRoom(RoomType.FAMILY);
        System.out.println(familyRoom1);
    }
}
