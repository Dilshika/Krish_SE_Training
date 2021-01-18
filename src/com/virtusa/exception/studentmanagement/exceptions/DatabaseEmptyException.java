package com.virtusa.exception.studentmanagement.exceptions;

public class DatabaseEmptyException extends Exception{
    private static final long serialVersionUID=1L;
    public DatabaseEmptyException(String message){
        super(message);
    }
    public DatabaseEmptyException(String message,Exception exception){
        super(message,exception);
    }
}
