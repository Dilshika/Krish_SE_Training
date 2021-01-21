package main.java.com.dil.collectionframework.list;

import java.util.*;


public class ListExample {
    public static void main(String[] args) {
        //create list
        List<String> list=new ArrayList<String>();

        //add elements
        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");

        //print elements
        for(String fruit:list)
            System.out.println(fruit);
    }
}
