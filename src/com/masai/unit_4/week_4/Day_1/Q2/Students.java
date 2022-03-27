package com.masai.unit_4.week_4.Day_1.Q2;

import java.util.TreeMap;

public class Students implements Comparable<Students> {
    private int Roll;
    private String Name;
    private int marks;

    public Students(int roll, String name, int marks) {
        Roll = roll;
        Name = name;
        this.marks = marks;

    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Students S) {
        if(marks>S.getMarks()){
            return +1;
        }
        if (marks<S.getMarks()){
            return -1;
        }
        else
        return 0;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Roll=" + Roll +
                ", Name='" + Name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        TreeMap<Students ,String> m1=new TreeMap<>();
        m1.put(new Students(10,"Ganesh",950),"Maharashtra");
        m1.put(new Students(12,"Surya",850),"Tamilnadu");
        m1.put(new Students(15,"Venkat",920),"Telangana");
        m1.put(new Students(16,"Dinesh",910),"Haryana");
        m1.put(new Students(18,"Srinu",880),"Kerala");
        System.out.println(m1);
    }
}

