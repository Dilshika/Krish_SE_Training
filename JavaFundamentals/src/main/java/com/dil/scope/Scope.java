package main.java.com.dil.scope;

public class Scope {
    //This is class scope

    static int classLevel; //This is a global variable and can be access in everywhere.

    public void demo(){
        //This is a method

        int methodLevel;  //This variable is only visible for this method

        for(int i=10;i<=5;i--){
            //This is a block
            int blockLevel;

            //all variables are visible from here
            classLevel=0;
            methodLevel=0;
            blockLevel=0;

        }
        //block level is not visible for upper level

        //class level is visible for its supper method


    }
    //method level is not visible to upper level

    public static void main(String[] args){

        System.out.println(classLevel);

    }
}
