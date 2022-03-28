package com.masai.unit_4.Evaluation_C4.Q3;


import java.util.LinkedHashMap;
import java.util.Map;

public class Employess implements Comparable<Employess>{
    private String id;
    private String name;
    private int Salary;


    public Employess(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public int getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employess{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
    @Override
    public int compareTo(Employess s) {
        if(Salary>s.Salary){
            return +1;
        }
        else if(Salary< s.Salary){
            return +1;
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        Map<String,Employess> a1=new LinkedHashMap<>();
        a1.put("HR",new Employess("abc","ram",50000));
        a1.put("Markating",new Employess("abd","shyam",55000));
        a1.put("Accounts",new Employess("abx","Mohan",65000));
        a1.put("Sales",new Employess("abz","Sohan",75000));

        System.out.println(a1);
    }



}
