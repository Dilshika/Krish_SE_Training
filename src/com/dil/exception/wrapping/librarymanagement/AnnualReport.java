package com.virtusa.exception.wrapping.librarymanagement;
import com.virtusa.exception.wrapping.exception.FileNotFound;

import java.io.IOException;

public class AnnualReport {

    public static void getAnnualReport() throws FileNotFound {
        try {
                printAnnualReport();
        } catch ( IOException exception ) {
            throw new FileNotFound("Annual Report Cannot be found",exception);//wrapped to uncheck exception
        }
    }
    public static void printAnnualReport() throws IOException{
        throw new IOException();    //checked exception
    }
}
