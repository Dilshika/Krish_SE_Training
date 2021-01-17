package com.virtusa.Exception.Wrapping.LibraryManagement;

import com.virtusa.Exception.Wrapping.Exception.FileNotFound;

public class Application {
    public static void main(String[] args) {
        AnnualReport annualReport=new AnnualReport();
        try {
            annualReport.getAnnualReport();
        }catch ( FileNotFound exception ){
            System.err.println("Annual Report cannot be found in the current directory");
        }
    }
}
