package com.virtusa.Exception.StudentManagement.StudentRegistration;
import com.virtusa.Exception.StudentManagement.Exceptions.IllegalCharacterException;


public class Application {
    public static void main(String[] args ) throws IllegalCharacterException {

        //System.out.println("Enter student Name:");
        String name="$tgh";
        String  phoneNumber="784075443323L";
        StudentRegistration studentRegistration=new StudentRegistration(name,phoneNumber);


        try {
            studentRegistration.nameValidation();

        } catch ( IllegalCharacterException exception) {
            exception.printStackTrace();
        }

        //String newName="amala@$";
        //String newNumber="09184667456635675";
    }
}
