package com.virtusa.Exception.StudentManagement.StudentRegistration;

import com.virtusa.Exception.StudentManagement.Exceptions.SQLQueryException;

public class SaveStudent {
    //add student details to the database
    public static void addStudent() throws SQLQueryException {
        //query for add student details to database
        boolean isquery=false;
        if (isquery) {
        } else {
            throw new SQLQueryException("Insert SQL Query is invalid");
        }
    }
}
