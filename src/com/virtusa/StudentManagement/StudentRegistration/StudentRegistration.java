package com.virtusa.StudentManagement.StudentRegistration;
import com.virtusa.StudentManagement.Exceptions.IllegalCharacterException;


public class StudentRegistration {

    private static String number,name;

    StudentRegistration(String name, String number){
        this.name=name;
        this.number=number;

    }

    public static void nameValidation() throws IllegalCharacterException{

        boolean valid = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");

       // if(valid){ phoneNumberVallidation();}else{throw new IllegalCharacterException("Name cannot have illegal characters");}

                   try {
                       phoneNumberVallidation();
                   }catch (IllegalCharacterException exception){

                throw new IllegalCharacterException("Name cannot have illegal characters",exception);

                 }
    }
    public static void phoneNumberVallidation() throws IllegalCharacterException {

        boolean valid = number.matches("077-777-7777");
        if (valid) {
        } else {
            throw new IllegalCharacterException("Illegal format of phone number");
        }
    }
}
