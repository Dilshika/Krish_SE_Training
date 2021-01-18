package com.virtusa.exception.wrapping.librarymanagement;

import com.virtusa.exception.wrapping.exception.FileNotFound;

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
