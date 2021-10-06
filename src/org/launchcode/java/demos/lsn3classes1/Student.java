package org.launchcode.java.demos.lsn3classes1;

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa = 0.0;

    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }

    public static String getGradeLevel(int credits) {
        if (credits <= 29){
            return "freshman";
        } else if (credits <= 59){
            return "sophomore";
        } else if (credits <= 89) {
            return "junior";
        } else {
            return "senior";
        }
    }
    public void addGrade(int courseCredits, double grade) {
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore/this.numberOfCredits;
    }

//    }

}
