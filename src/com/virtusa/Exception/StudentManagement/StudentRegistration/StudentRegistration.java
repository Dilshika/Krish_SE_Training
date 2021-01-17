package com.virtusa.Exception.StudentManagement.StudentRegistration;
import com.virtusa.Exception.StudentManagement.Exceptions.DatabaseEmptyException;
import com.virtusa.Exception.StudentManagement.Exceptions.IllegalCharacterException;
import com.virtusa.Exception.StudentManagement.Exceptions.IllegalFormatException;
import com.virtusa.Exception.StudentManagement.Exceptions.SQLQueryException;

import java.sql.SQLException;


public class StudentRegistration {

    private static String number, name;

    StudentRegistration(String name, String number) {
        this.name = name;
        this.number = number;

    }

    public static void nameValidation() throws IllegalCharacterException {

        //boolean isvalid = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");

        // if(isvalid){ phoneNumberVallidation();}else{throw new IllegalCharacterException("Name cannot have illegal characters");}
        try {
            phoneNumberVallidation();
        } catch ( IllegalFormatException exception ) {

            throw new IllegalCharacterException("Name cannot have illegal characters", exception);

        }
    }

    public static void phoneNumberVallidation() throws IllegalFormatException {
        //boolean isvalid = number.matches("077-777-7777");
        //if (isvalid) {}else{ throw new IllegalFormatException("Illegal format of phone number");}
            try {
                addCourse();
            } catch ( DatabaseEmptyException exception ) {
                throw new IllegalFormatException("Illegal format of phone number", exception);
            }
        }


    public static void addCourse() throws DatabaseEmptyException {
        //course load query
        try {
            addStudent();
        } catch ( SQLQueryException exception ){
        throw new DatabaseEmptyException("No courses are found in database",exception);
    }

}

    public static void addStudent() throws SQLQueryException{
        //query for add student details to database
        throw new SQLQueryException("Insert SQL Query is invalid");
    }

}
