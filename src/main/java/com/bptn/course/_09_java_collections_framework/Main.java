package com.bptn.course._09_java_collections_framework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Student1", 80));
        studentList.add(new Student("Student2", 75));
        studentList.add(new Student("Student3", 86));
        studentList.add(new Student("Student4", 74));
        studentList.add(new Student("Student5", 92));
        studentList.add(new Student("Student6", 72));
        studentList.add(new Student("Student7", 60));

        // initialize passList
        List<Student> passList = new ArrayList<>();

        // Loop through studentlist to filter the students with target grade
        for (Student x : studentList) {
        	if (x.getClassGrade() >= 75) {
        		passList.add(x);
        	}
        }

        // print out the students using a for-each loop.
        for (Student x : passList) {
        	System.out.println(x.toString());
        }
        
    }
}

/**
 * Write a program that loops over an ArrayList called studentList that copies all the students whose grade is equal to or greater than 75 to a new ArrayList called passList. Note that the Student class is already defined in the Student.java file in the second tab.
 * Steps: Add the following to the main() method:
 * Allocate memory for the passList ArrayList using the new keyword.
 * Loop over the studentList and add the students whose grade is equal to or greater than 75 to the passList.
 * Finally, print out the passList using a for-each loop.
 * Try It
 */
