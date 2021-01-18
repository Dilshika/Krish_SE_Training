package com.virtusa.Exception.StudentManagement.StudentRegistration;

import com.virtusa.Exception.StudentManagement.Exceptions.DatabaseEmptyException;
import com.virtusa.Exception.StudentManagement.Exceptions.SQLQueryException;

public class Course {

    public static void getCourse() throws DatabaseEmptyException {
        //query for the class name showing
        try {
            Student.addStudent();
        } catch ( SQLQueryException exception ) {
            throw new DatabaseEmptyException("No courses are found in database", exception);
        }
    }
}
