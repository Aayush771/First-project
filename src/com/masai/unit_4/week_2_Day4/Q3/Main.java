package com.masai.unit_4.week_2_Day4.Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter Roll Number");
        int roll= SC.nextInt();
        System.out.println("Enter Name");
        String name=SC.next();
        System.out.println("Enter Marks");
        int marks= SC.nextInt();
        Student m1= new Student();
        new Student(roll,name,marks);
        m1.setRollNumber(roll);
        m1.setStudentName(name);
        m1.setMarks(marks);
        m1.getMarks();
        m1.getStudentName();
        m1.getMarks();

    }
}
