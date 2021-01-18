package com.virtusa.exception.exceptiontypes.billingsystem;

import com.virtusa.exception.exceptiontypes.checkedexception.PrinterNotFoundException;

public class Print {
    public  static void printBill() throws PrinterNotFoundException {
        //call the print spooler
        //implementation codes
        throw new PrinterNotFoundException("Printer cannot be found");
    }
}
