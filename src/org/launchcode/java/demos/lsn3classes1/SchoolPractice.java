package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Christina");
        student1.setNumberOfCredits(1);
        student1.setGpa(4.0);
    }

    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;

        public class Teacher {
            private String firstName;
            private String lastName;
            private String subject;
            private Integer yearsTeaching;
        }

    }
}