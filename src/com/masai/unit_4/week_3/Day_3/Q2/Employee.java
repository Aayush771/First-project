package com.masai.unit_4.week_3.Day_3.Q2;

import com.masai.unit_4.week_3.Day_3.Q1.Products;

import java.util.*;

public class Employee implements Comparable<Employee>{
    private int empId;
    private String empName;
    private double Salary;

    public Employee()  {

    }

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        Salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }



    @Override
    public int compareTo(Employee S) {
       if(Salary>S.getSalary()){
           return +1;
       }
       else if(Salary<S.getSalary()){
           return -1;
       }
       else
           return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Employee> a1=new TreeSet<>();
        System.out.println("Enter Number of Employees");
        int Num=sc.nextInt();
        for(int i=0;i<Num;i++){
            System.out.println("Enter Employ id");
            int id=sc.nextInt();

            System.out.println("Enter Employ  Name");
            String name=sc.next();

            System.out.println("Enter Employ Salary");
            double salary=sc.nextInt();
            Employee p1=new Employee(id,name,salary);
            a1.add(p1);
        }
       List<Employee> s1=new ArrayList<>(a1);
        for(int i=0;i<a1.size();i++){
            Employee employee =  s1.get(i);
            System.out.println(employee);
        }
    }
}
