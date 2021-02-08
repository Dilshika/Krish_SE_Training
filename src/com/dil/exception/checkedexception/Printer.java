package com.virtusa.exception.checkedexception;

import com.virtusa.exception.checkedexception.PrinterNotFoundException;

public class Printer {
    public  static void printBill() throws PrinterNotFoundException {
        //call the print spooler
        //implementation codes
        throw new PrinterNotFoundException("Printer cannot be found");
    }
}
