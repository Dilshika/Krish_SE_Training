package com.virtusa.Exception.BillingSystem;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BillPayment {
    public static int total;
    public static int tax;

    BillPayment(int total,int tax){
        this.total=total;
        this.tax=tax;
    }

    public static void calculateAmount(){

        if(tax==0){
            
        }
    }
}
