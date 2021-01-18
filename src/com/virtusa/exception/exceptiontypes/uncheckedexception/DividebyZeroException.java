package com.virtusa.exception.exceptiontypes.uncheckedexception;

public class DividebyZeroException extends RuntimeException{
    private static final long serialVersionUID=1L;
    public DividebyZeroException(String message){
        super(message);
    }
    public DividebyZeroException(String message,Exception exception){
        super(message,exception);
    }
}
