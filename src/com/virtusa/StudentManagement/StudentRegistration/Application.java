package com.virtusa.StudentManagement.StudentRegistration;
import com.virtusa.StudentManagement.Exceptions.IllegalCharacterException;
import com.virtusa.StudentManagement.Exceptions.SQLQueryException;

public class Application {
    public static void main(String[] args ) throws IllegalCharacterException {

        //System.out.println("Enter student Name:");
        String name="$tgh";
        String  phoneNumber="784075443323L";
        StudentRegistration studentRegistration=new StudentRegistration(name,phoneNumber);

        String newName="amala@$";
        String newNumber="09184667456635675";
        UpdateStudent student=new UpdateStudent(newName,newNumber);

        try {
            //studentRegistration.nameValidation();
            //studentRegistration.phoneNumberVallidation();
            student.updateName();
        } catch ( SQLQueryException exception) {
            exception.printStackTrace();
        }

    }
}
