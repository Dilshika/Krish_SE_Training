package com.virtusa.Exception.CheckedNUncheckedException.BillingSystem;

import com.virtusa.Exception.CheckedNUncheckedException.UncheckedException.DividebyZeroException;


public class BillPayment {
    public static int total,billAmount;
    public static int taxRate;

    BillPayment(int total,int taxRate){
        this.total=total;
        this.taxRate=taxRate;
    }

    public static void calculateAmount() throws DividebyZeroException{
        if(taxRate==0){
            throw new DividebyZeroException("Tax amount cannot be zero");
        }else{
            int tax=total/taxRate;
            billAmount=total+tax;
        }
    }


}
