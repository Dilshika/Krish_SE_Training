package main.java.com.dil.scope;

public class BlockRule {
  static int classLevel=10;
  public static void main(String[] args) {
      System.out.println("before block " + classLevel);
      {//This is a block
          int classLevel=20;
          System.out.println("inside block "+classLevel);   //Print the block level value
      }
      System.out.println("outside the block "+classLevel); //Print the class level variable
  }
}
