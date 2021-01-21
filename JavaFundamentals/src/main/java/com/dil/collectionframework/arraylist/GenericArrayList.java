package main.java.com.dil.collectionframework.arraylist;

import java.util.*;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Audi");
        cars.add("Bugatti");
        System.out.println(cars);

        //sort array list
        Collections.sort(cars);
        System.out.println("Sorted array:");


        //print elements using for each
        for(String item:cars){
            System.out.println(item);
        }

        //get first element
        System.out.println("First Element:"+cars.get(0));

        //change item
        cars.set(2,"Porsche");
        System.out.println(cars);

        //size
        System.out.println("Size of array:"+cars.size());

        //remove item
        cars.remove(3);
        System.out.println("Cars:"+cars);

        System.out.println("Using Iterator:");

        //Traversing through iterator
        Iterator itr=cars.iterator(); //getting iterator
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Using ListIterator interface:");

        //List Iterator
        ListIterator<String> list=cars.listIterator(cars.size());
        while (list.hasPrevious()){
            System.out.println(list.previous());
        }

        System.out.println("Using for each Method:");

        //foreach method
        cars.forEach(car->{//Lambda Expression
            System.out.println(car);
        });

        System.out.println("Using for each remaining method:");
        Iterator itr1=cars.iterator();
        itr1.forEachRemaining(car->{
            System.out.println(car);
        });

        //add new ArrayList
        ArrayList<String > newCars=new ArrayList<String>();
        newCars.add("Audi");
        newCars.add("Porsche");
        newCars.add("Bugatti");
        newCars.add("Mercedes Benz ");

        //retaining elements
        cars.retainAll(newCars);
        System.out.println("Retained:");

         for(String item:cars){
            System.out.println(item);
        }

        //clear
        cars.clear();
        System.out.println(cars);

        System.out.println(cars.isEmpty());
        System.out.println(newCars.isEmpty());

    }
}
