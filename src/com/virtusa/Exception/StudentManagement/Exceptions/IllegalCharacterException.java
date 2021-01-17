package com.virtusa.Exception.StudentManagement.Exceptions;

public class IllegalCharacterException extends Exception{

public IllegalCharacterException(String message,Exception exception){
    super(message,exception);
}
    public IllegalCharacterException(String message){
    super(message);
    }
}
