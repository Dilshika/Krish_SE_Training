package com.virtusa.Wrapping.LibraryManagement;

import com.virtusa.Wrapping.Exception.FileNotFound;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        AnnualReport annualReport=new AnnualReport();
        try {
            annualReport.getAnnualReport();
        }catch ( FileNotFound exception ){
            exception.printStackTrace();
        }
    }
}
