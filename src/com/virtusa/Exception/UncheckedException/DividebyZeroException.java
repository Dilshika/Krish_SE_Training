package com.virtusa.Exception.UncheckedException;

public class DividebyZeroException extends RuntimeException{
    public DividebyZeroException(String message){
        super(message);
    }
    public DividebyZeroException(String message,Exception exception){
        super(message,exception);
    }
}
