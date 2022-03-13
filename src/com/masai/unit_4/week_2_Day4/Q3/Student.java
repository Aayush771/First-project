package com.masai.unit_4.week_2_Day4.Q3;

public class Student {
private int rollNumber;
private String studentName;
private int marks;

    public Student() {
    }

    public Student(int rollNumber, String studentName, int marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    public void getRollNumber() {
        System.out.println(rollNumber); ;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void getStudentName() {
        System.out.println(studentName); ;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void getMarks() {
        System.out.println(marks);
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
