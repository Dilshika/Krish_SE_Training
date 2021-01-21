package main.java.com.dil.collectionframework.arraylist;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Student {
        int rollNo;
        String name;

        Student(int rollNo,String name){
            this.rollNo=rollNo;
            this.name=name;
        }

    public static void main(String[] args) {
        Student student1=new Student(101,"Zeena");
        Student student2=new Student(102,"Sushanth");
        Student student3=new Student(103,"Prena");

        //Arraylist
        ArrayList<Student> students=new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        //Iterator
        Iterator itr=students.iterator();
        while (itr.hasNext()){
            Student student=(Student) itr.next();
            System.out.println(student.rollNo+" "+student.name);
        }

        try {
            //Serialization
            FileOutputStream file=new FileOutputStream("file");
            ObjectOutputStream obj=new ObjectOutputStream(file);
            obj.writeObject(students);
            file.close();
            obj.close();

            //Deserialization
            FileInputStream fileInput=new FileInputStream("file");
            ObjectInputStream inputObj=new ObjectInputStream(fileInput);
            ArrayList list=(ArrayList) inputObj.readObject();
            System.out.println(list);

        }catch ( IOException | ClassNotFoundException exception ){
            System.out.println(exception);
        }

    }
}
