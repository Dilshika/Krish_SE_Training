package com.virtusa.Exception.StudentManagement.StudentRegistration;
import com.virtusa.Exception.StudentManagement.Exceptions.DatabaseEmptyException;
import com.virtusa.Exception.StudentManagement.Exceptions.IllegalCharacterException;
import com.virtusa.Exception.StudentManagement.Exceptions.IllegalFormatException;
import com.virtusa.Exception.StudentManagement.Exceptions.SQLQueryException;


public class StudentValidation {

    private static String number, name;

    StudentValidation(String name, String number) {
        this.name = name;
        this.number = number;

    }

    //check validity of name
    public static void nameValidation() throws IllegalCharacterException {

       //boolean isvalid = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");

        // if(isvalid){ phoneNumberVallidation();}else{throw new IllegalCharacterException("Name cannot have illegal characters");}
        try {
            phoneNumberVallidation();
        } catch ( IllegalFormatException exception ) {

            throw new IllegalCharacterException("Name cannot have illegal characters", exception);

        }
    }

    //check format of phone number
    public static void phoneNumberVallidation() throws IllegalFormatException {
        //boolean isvalid = number.matches("077-777-7777");
        //if (isvalid) {}else{ throw new IllegalFormatException("Illegal format of phone number");}
            try {
                GetCourse.getCourse();
            } catch ( DatabaseEmptyException exception ) {
                throw new IllegalFormatException("Illegal format of phone number", exception);
            }
        }




}
