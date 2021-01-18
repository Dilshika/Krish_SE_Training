package com.virtusa.exception.checkedexception;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to print bill(if true:true else:false)");
        boolean isPrint = scanner.nextBoolean();

        if (isPrint) {
            Printer bill = new Printer();
            try {
                bill.printBill();
            } catch ( PrinterNotFoundException exception ) {
                System.err.println("Check whether printer is connected");   //checked Exception
            }

        }
    }
}
