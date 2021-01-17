package com.virtusa.Exception.StudentManagement.StudentRegistration;
import com.virtusa.Exception.StudentManagement.Exceptions.IllegalCharacterException;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;


public class Application {
    public static void main(String[] args ) throws IllegalCharacterException {

        Logger logger = Logger.getLogger(StudentRegistration.class.getName());
        //System.out.println("Enter student Name:");
        String name = "$tgh";
        String phoneNumber = "784075443323L";
        StudentRegistration studentRegistration = new StudentRegistration(name, phoneNumber);


        try {
            studentRegistration.nameValidation();

        } catch ( IllegalCharacterException exception ) {

            System.err.println("Cannot continue further,Check the log");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            exception.printStackTrace(printWriter); 
            String stackTrace = stringWriter.toString(); //Convert stack trace into String
            //System.err.println(stackTrace);

            //log the exception
            logger.setLevel(Level.FINE);
            logger.addHandler(new ConsoleHandler());

            try {
                //FileHandler file name with max size and number of log files limit
                Handler fileHandler = new FileHandler("E:/VitusaLPTraining/src/com/virtusa/Exception/StudentManagement", 2000, 5);
                logger.addHandler(fileHandler);
                logger.log(Level.CONFIG, stackTrace);
            } catch ( SecurityException | IOException exception1 ) {
                System.err.println(exception1);
            }
        }
    }
}

