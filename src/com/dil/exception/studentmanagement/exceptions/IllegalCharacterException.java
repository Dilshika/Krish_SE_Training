package com.virtusa.exception.studentmanagement.exceptions;

public class IllegalCharacterException extends Exception{
    private static final long serialVersionUID=1L;
public IllegalCharacterException(String message,Exception exception){
    super(message,exception);
}
    public IllegalCharacterException(String message){
    super(message);
    }
}
