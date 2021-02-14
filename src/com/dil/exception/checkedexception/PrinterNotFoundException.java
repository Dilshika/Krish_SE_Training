package com.dil.exception.checkedexception;

public class PrinterNotFoundException extends Exception{
    private static final long serialVersionUID=1L;
    public PrinterNotFoundException(String message){
        super(message);
    }
    public PrinterNotFoundException(String message, Exception exception){
        super(message,exception);
    }
}
