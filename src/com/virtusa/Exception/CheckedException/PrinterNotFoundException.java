package com.virtusa.Exception.CheckedException;

public class PrinterNotFoundException extends Exception{
    PrinterNotFoundException(String message){
        super(message);
    }
    PrinterNotFoundException(String message, Exception exception){
        super(message,exception);
    }
}
