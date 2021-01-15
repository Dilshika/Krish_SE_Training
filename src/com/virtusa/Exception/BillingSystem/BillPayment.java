package com.virtusa.Exception.BillingSystem;

import com.virtusa.Exception.CheckedException.PrinterNotFoundException;
import com.virtusa.Exception.UncheckedException.DividebyZeroException;


public class BillPayment {
    public static int total,billAmount;
    public static int tax;

    BillPayment(int total,int tax){
        this.total=total;
        this.tax=tax;
    }

    public static void calculateAmount() throws DividebyZeroException{
        if(tax==0){
            throw new DividebyZeroException("Tax amount cannot be zero");
        }else{
            int taxAmount=total/tax;
            billAmount=total+taxAmount;
        }
    }

    public  static void printBill() throws PrinterNotFoundException{
        throw new PrinterNotFoundException("Printer cannot be found");
    }
}
