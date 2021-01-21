package main.java.com.dil.sorting;

public class BubbleSort {

    public static void bubbleSort(int[] array){
        int temp;   //temporary variable
        int length = array.length;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    sorted = false;

                }
            }

        }
        Application.print(array);


    }
}