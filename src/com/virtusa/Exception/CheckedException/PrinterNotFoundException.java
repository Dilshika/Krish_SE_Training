package com.virtusa.Exception.CheckedException;

public class PrinterNotFoundException extends Exception{
    public PrinterNotFoundException(String message){
        super(message);
    }
    public PrinterNotFoundException(String message, Exception exception){
        super(message,exception);
    }
}