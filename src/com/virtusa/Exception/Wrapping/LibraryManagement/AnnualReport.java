package com.virtusa.Exception.Wrapping.LibraryManagement;
import com.virtusa.Exception.Wrapping.Exception.FileNotFound;

import java.io.IOException;

public class AnnualReport {

    public static void getAnnualReport() throws FileNotFound {
        try {
                printAnnualReport();
        } catch ( IOException exception ) {
            throw new FileNotFound("Annual Report Cannot be found",exception);
        }
    }
    public static void printAnnualReport() throws IOException{
        throw new IOException();
    }
}
