package main.java.com.dil.collectionframework.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleLinedList {
    public static void main(String[] args) {
        LinkedList<String> student=new LinkedList<String>();

        //add elements to linked list
        student.add("Krishore");
        student.add("Indukala");
        student.add("Mahima");
        student.add("Yogeshvar");

        //add element to specific position
        student.add(4,"Anirudh");

        //create new List
        LinkedList<String> students=new LinkedList<String>();

        //add elements
        students.add(0,"Menu");
        students.add("Hans");

        //adding second list elements to first list
        student.addAll(students);

        //remove elements
        students.remove("Hans");
        student.remove(6);
        student.removeLast();

        //print elements in linked list
        Iterator<String> iterator=student.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Reverse order:");
        //traversing the list of elements in reverse order
        Iterator itr=student.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
