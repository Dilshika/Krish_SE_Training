package com.virtusa.Exception.StudentManagement.Exceptions;

public class DatabaseEmptyException extends Exception{
    public DatabaseEmptyException(String message){
        super(message);
    }
    public DatabaseEmptyException(String message,Exception exception){
        super(message,exception);
    }
}
