package com.dil.exception.studentmanagement.exceptions;

public class SQLQueryException extends Exception{
    private static final long serialVersionUID=1L;

        public SQLQueryException(String message){
            super(message);
        }
        public SQLQueryException(String message,Exception exception){
            super(message,exception);
        }
}


