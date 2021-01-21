package main.java.com.dil.collectionframework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {

        //creating array
        String[] array={"Java","Python","Ruby","C++"};
        System.out.println("Array:"+ Arrays.toString(array));

        //converting array to list
        List<String> list=new ArrayList<String>();
        for(String languages:list)
            System.out.println(list);
    }

}
