package com.virtusa.exception.studentmanagement.studentregistration;
import com.virtusa.exception.studentmanagement.exceptions.IllegalCharacterException;


public class Application {
    public static void main(String[] args ) {

        String name = "$tgh";
        String phoneNumber = "784075443323L";
        Student student = new Student(name, phoneNumber);


        try {
            student.nameValidation();

        } catch ( IllegalCharacterException exception ) {

            //StringWriter stringWriter = new StringWriter();
            //PrintWriter printWriter = new PrintWriter(stringWriter);
            //exception.printStackTrace(printWriter);
            //String stackTrace = stringWriter.toString(); //Convert stack trace into String
           // System.err.println(stackTrace);
            exception.printStackTrace();
        }
    }
}

