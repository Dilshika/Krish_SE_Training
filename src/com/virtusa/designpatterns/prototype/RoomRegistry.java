package com.virtusa.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class RoomRegistry {
    private Map<RoomType,Room> rooms=new HashMap<>();

    public RoomRegistry(){
        this.initialize();
    }

    public Room getRoom(RoomType roomType){
        Room room=null;
       try{
           room=(Room)rooms.get(roomType).clone();
       }catch ( CloneNotSupportedException exception ){
           exception.printStackTrace();
       }
       return room;
    }

    private void initialize(){
        SingleRoom singleRoom=new SingleRoom();
        singleRoom.setSpentTime(24);
        singleRoom.setRoomNumber(404);
        singleRoom.setRoomPackage("Silver");

        FamilyRoom familyRoom=new FamilyRoom();
        familyRoom.setNumberOfBeds(4);
        familyRoom.setRoomNumber(907);
        familyRoom.setRoomPackage("GOLD");

        rooms.put(RoomType.SINGLE,singleRoom);
        rooms.put(RoomType.FAMILY,familyRoom);

    }
}
