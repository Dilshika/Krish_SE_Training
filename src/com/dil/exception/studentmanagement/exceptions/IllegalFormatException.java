package com.dil.exception.studentmanagement.exceptions;

public class IllegalFormatException extends Exception {
    private static final long serialVersionUID=1L;
    public IllegalFormatException(String message){
        super(message);
    }
    public IllegalFormatException(String message,Exception exception){
        super(message,exception);
    }
}
