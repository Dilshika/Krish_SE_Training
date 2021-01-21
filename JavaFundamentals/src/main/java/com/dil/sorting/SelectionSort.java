package main.java.com.dil.sorting;

public class SelectionSort {
       static int position;
    public static void selectionSort(int[] array){
        int temp;
        for(int k=1;k<array.length-1;k++){
           position=smallest(array,k,1);
           temp=array[k];
           array[k]=array[position];
           array[position]=temp;
        }
        Application.print(array);
    }

    private static int smallest(int[] array,int k,int position){
        int small= array[k];
        position=k;

        for(int j=k+1;j<array.length-1;j++){
            if(small>array[j]){
                small=array[j];
                position=j;
            }
        }
        return position;
    }



}

