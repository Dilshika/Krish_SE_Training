package com.virtusa.Wrapping.Exception;

public class FileNotFound extends RuntimeException{
    public FileNotFound(String message){
        super(message);
    }
    public FileNotFound(String message,Exception exception){
        super(message,exception);
    }
}
