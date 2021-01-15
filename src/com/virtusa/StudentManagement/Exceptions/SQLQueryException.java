package com.virtusa.StudentManagement.Exceptions;

public class SQLQueryException extends Exception{

        public SQLQueryException(String message){
            super(message);
        }
        public SQLQueryException(String message,Exception exception){
            super(message,exception);
        }
}


