package com.virtusa.exception.uncheckedexception;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bill amount");
        int billAmount = scanner.nextInt();
        System.out.println("Enter tax rate");
        int taxRate = scanner.nextInt();

        Payment billPayment = new Payment(billAmount, taxRate);
        billPayment.calculateAmount(); //throws unchecked Exception


    }
}
