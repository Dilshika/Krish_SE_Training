package main.java.com.dil.collectionframework.list;

import java.util.*;

public class ListToArray {
    public static void main(String[] args) {

        //create a list
        List<Integer> marks=new ArrayList<Integer>();
        marks.add(100);
        marks.add(30);
        marks.add(76);

        //add elements
        marks.add(3,65);
        marks.add(4,89);

        //set elements
        marks.set(3,75);

        //sorting elements
        Collections.sort(marks);

        //converting ArrayList to Array
        Integer[] array=marks.toArray(new Integer[marks.size()]);

        //printing array and list
        System.out.println("Array:"+ Arrays.toString(array));
        System.out.println("List:"+marks);

        //Iterator interface
        ListIterator<Integer> itr=marks.listIterator();

        //traverse forward
        while (itr.hasNext())
            System.out.println("index:"+itr.nextIndex()+",value:"+itr.next());

        //travers backward
        while (itr.hasPrevious())
            System.out.println("index:"+itr.previousIndex()+",value:"+itr.previous());
    }

}
