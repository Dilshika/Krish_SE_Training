package com.virtusa.Exception.Wrapping.Exception;

public class FileNotFound extends RuntimeException{
    private static final long serialVersionUID=1L;
    public FileNotFound(String message){
        super(message);
    }
    public FileNotFound(String message,Exception exception){
        super(message,exception);
    }
}
