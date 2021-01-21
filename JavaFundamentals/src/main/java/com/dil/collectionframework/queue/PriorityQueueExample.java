package main.java.com.dil.collectionframework.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Anya");
        queue.add("George");
        queue.add("Watson");
        queue.add("Anne");

        //header
        System.out.println("head:"+queue.element());
        System.out.println("head::"+queue.peek());

        //queue elements
        Iterator itr=queue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        //remove
        queue.remove();
        queue.poll();
        System.out.println("After Removing two elements:");

        Iterator<String> iterator=queue.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
