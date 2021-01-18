package com.virtusa.exception.wrapping.librarymanagement;

import com.virtusa.exception.wrapping.exception.FileNotFound;

public class Application {
    public static void main(String[] args) {
        AnnualReport annualReport=new AnnualReport();
            annualReport.getAnnualReport();
    }
}
