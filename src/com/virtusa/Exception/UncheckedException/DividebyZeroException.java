package com.virtusa.Exception.UncheckedException;

public class DividebyZeroException extends RuntimeException{
    DividebyZeroException(String message){
        super(message);
    }DividebyZeroException(String message,Exception exception){
        super(message,exception);
    }
}
