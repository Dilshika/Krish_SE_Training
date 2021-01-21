package main.java.com.dil.sorting;

public class Application {
    public static void main(String[] args) {
        int[] array = {4, 2,1, 1, 5, 3,8};  //unsorted array
        BubbleSort.bubbleSort(array);   //sort using bubble sort

        InsertionSort.insertionSort(array);//sort using insertion sort

        SelectionSort.selectionSort(array); //sort using selection sort

    }

    public static void print(int[] array){
        //print the sorted array
        for(int ele=0;ele<array.length ;ele++){
            System.out.print(array[ele]+" ");

        }
        System.out.println();
    }
}
