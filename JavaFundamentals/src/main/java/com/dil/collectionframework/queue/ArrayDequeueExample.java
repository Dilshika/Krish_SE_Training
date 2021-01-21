package main.java.com.dil.collectionframework.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.add("Megha");
        deque.add("Volga");
        deque.add("Chris");
        deque.add("Menon");

        //add element at first
        deque.addFirst("Viyan");

        //remove from last
        deque.pollLast();

        //print queue
        for (String name:deque)
            System.out.println(name);
    }
}
