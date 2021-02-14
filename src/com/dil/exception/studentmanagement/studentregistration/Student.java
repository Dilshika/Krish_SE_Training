package com.dil.exception.studentmanagement.studentregistration;
import com.dil.exception.studentmanagement.exceptions.DatabaseEmptyException;
import com.dil.exception.studentmanagement.exceptions.IllegalCharacterException;
import com.dil.exception.studentmanagement.exceptions.IllegalFormatException;
import com.dil.exception.studentmanagement.exceptions.SQLQueryException;


public class Student {

    private static String number, name;

    Student(String name, String number) {
        this.name = name;
        this.number = number;

    }

    //check validity of name
    public static void nameValidation() throws IllegalCharacterException {

       //boolean isvalid = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");

        // if(isvalid){ phoneNumberVallidation();}else{throw new IllegalCharacterException("Name cannot have illegal characters");}
        try {
            phoneNumberValidation();
        } catch ( IllegalFormatException exception ) {

            throw new IllegalCharacterException("Name cannot have illegal characters", exception);

        }
    }

    //check format of phone number
    public static void phoneNumberValidation() throws IllegalFormatException {
        //boolean isvalid = number.matches("077-777-7777");
        //if (isvalid) {}else{ throw new IllegalFormatException("Illegal format of phone number");}
            try {
                Course.getCourse(); //call the function to load the course names
            } catch ( DatabaseEmptyException exception ) {
                throw new IllegalFormatException("Illegal format of phone number", exception);
            }
        }

        //save student to database
    public static void addStudent() throws SQLQueryException {
        //query for add student details to database
        boolean isquery=false;
        if (isquery) {
        } else {
            throw new SQLQueryException("Insert SQL Query is invalid");
        }
    }


}
