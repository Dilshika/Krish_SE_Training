package com.virtusa.exception.studentmanagement.studentregistration;

import com.virtusa.exception.studentmanagement.exceptions.DatabaseEmptyException;
import com.virtusa.exception.studentmanagement.exceptions.SQLQueryException;

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
