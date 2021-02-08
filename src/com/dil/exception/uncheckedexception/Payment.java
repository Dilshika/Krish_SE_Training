package com.virtusa.exception.uncheckedexception;


public class Payment {
    public static int total,billAmount;
    public static int taxRate;

    Payment(int total, int taxRate){
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
