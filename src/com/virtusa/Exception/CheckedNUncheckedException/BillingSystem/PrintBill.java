package com.virtusa.Exception.CheckedNUncheckedException.BillingSystem;

import com.virtusa.Exception.CheckedNUncheckedException.CheckedException.PrinterNotFoundException;

public class PrintBill {
    public  static void printBill() throws PrinterNotFoundException {
        //call the print spooler
        //implementation codes
        throw new PrinterNotFoundException("Printer cannot be found");
    }
}
