package main.java.com.dil.sorting;

public class InsertionSort {

    public static void insertionSort(int[] array){
    for(int itr=1;itr<array.length;itr++){
        int pivot=array[itr];
        int j=itr-1;

        while(j>=0 && pivot<array[j]) {
            array[j+1]=array[j];
            j--;
        }
        //at this point we exit so j is either -1 or
        // its the first element where pivot>=array[j]
        array[j+1]=pivot;
    }

    Application.print(array);
    }
}
