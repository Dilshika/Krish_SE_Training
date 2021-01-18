package com.virtusa.exception.exceptiontypes.billingsystem;

import com.virtusa.exception.exceptiontypes.checkedexception.PrinterNotFoundException;
import com.virtusa.exception.exceptiontypes.uncheckedexception.DividebyZeroException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bill amount");
        int billAmount = scanner.nextInt();
        System.out.println("Enter tax rate");
        int taxRate = scanner.nextInt();

        Payment billPayment = new Payment(billAmount, taxRate);
        try {
            billPayment.calculateAmount();
        } catch ( DividebyZeroException exception ) {
            System.err.println("Tax Rate must be greater than zero");   //unchecked Exception
        }

        System.out.println("Do you want to print bill(if true:true else:false)");
        boolean isPrint = scanner.nextBoolean();

        if (isPrint) {
            Print bill = new Print();
            try {
                bill.printBill();
            } catch ( PrinterNotFoundException exception ) {
                System.err.println("Check whether printer is connected");   //checked Exception
            }

        }
    }
}
