package com.virtusa.StudentManagement.StudentRegistration;

import com.virtusa.StudentManagement.Exceptions.IllegalCharacterException;
import com.virtusa.StudentManagement.Exceptions.SQLQueryException;

import static com.virtusa.StudentManagement.StudentRegistration.StudentRegistration.*;

public class UpdateStudent {

    public static String name,number;

    UpdateStudent(String name,String number) {
        this.name = name;
        this.number=number;
    }

    public static void updateName() throws SQLQueryException {
        try {
            StudentRegistration.nameValidation();
            StudentRegistration.phoneNumberVallidation();
        } catch ( IllegalCharacterException exception ) {
            throw new SQLQueryException("Incorrect SQL Query",exception);
        }

    }
    public static void updateNumber() throws SQLQueryException {
        try {
            StudentRegistration.phoneNumberVallidation();
        } catch ( IllegalCharacterException exception ) {
            throw new SQLQueryException("Incorrect SQL Query",exception);
        }

    }
}