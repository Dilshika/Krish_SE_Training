package main.java.com.dil.controlstatements.switchstatement;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        //specifying date number

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hi I am a Fortune teller... What is day you like most?");
        System.out.println("Enter number: 1.Monday \n 2.Tuesday \n 3.Wednesday \n 4.Thursday \n 5.Friday \n 6.Saturday \n 7.Sunday");
         int num=scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("Monday you look like moon");
                break;
            case 2:
                System.out.println("Oh this is not Mars");
                break;
            case 3:
                System.out.println("Do you like to have a break?");
                break;
            case 4:
                System.out.println("You are big as Jupiter ");
                break;
            case 5:
                System.out.println("As beautiful as goddess Venus ");
                break;
            case 6:
                System.out.println("Most beautiful saturn");
                break;
            case 7:
                System.out.println("Powerful as sun");
                break;
            default:System.out.println("Please select a valid day");
        }
    }
}
