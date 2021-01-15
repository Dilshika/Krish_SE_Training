package com.virtusa.Exception.BillingSystem;

import com.virtusa.Exception.CheckedException.PrinterNotFoundException;
import com.virtusa.Exception.UncheckedException.DividebyZeroException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter bill amount");
        int billAmount=scanner.nextInt();
        System.out.println("Enter tax amount");
        int tax=scanner.nextInt();

        BillPayment billPayment=new BillPayment(billAmount,tax);
        try {
            billPayment.calculateAmount();
        } catch ( DividebyZeroException e ) {
            e.printStackTrace();
        }
        try {
            billPayment.printBill();
        } catch ( PrinterNotFoundException e ) {
            e.printStackTrace();
        }
    }
}
