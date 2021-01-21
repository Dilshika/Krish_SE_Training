package main.java.com.dil.collectionframework.map;

import java.util.HashMap;
import java.util.*;

public class GenericHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Nora");
        map.put(101, "Peggy");
        map.put(103, "Jack");
        map.put(104, "Peter");

        //elements can transverse in any order
        for (Map.Entry ele : map.entrySet()) {
            System.out.println(ele.getKey() + " " + ele.getValue());
        }

        //Returns a set view
        map.entrySet();

        
    }

}
