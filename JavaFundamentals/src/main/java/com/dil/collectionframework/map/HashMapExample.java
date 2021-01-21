package main.java.com.dil.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //creating hash map
        HashMap<Integer,String> map=new HashMap<Integer, String>();

        //put elements into hash map
        map.put(1,"Apple");
        map.put(2,"Papaya");
        map.put(3,"Water melon");
        map.put(4,"Mango");

        //put if absent
        map.putIfAbsent(5,"Tomato");

        //remove
        map.remove(1);

        System.out.println("Hash Map:");
        for(Map.Entry fruit:map.entrySet())
            System.out.println(fruit.getKey()+" "+fruit.getValue());

    }
}
