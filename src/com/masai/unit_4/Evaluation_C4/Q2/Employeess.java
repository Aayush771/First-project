package com.masai.unit_4.Evaluation_C4.Q2;

import java.io.*;

public class Employeess {
    private String empId;
    private String empName;
    private Address address;
    private String email;
   transient private String password;

    public Employeess(String empId, String empName, Address address, String email) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address a1=new Address("jharkhand ","Dhanbd","828106");
        Employeess E1=new Employeess("1234","rohan",a1,"1234@gmailcom");
        FileOutputStream fos= new FileOutputStream("emp.text");
        ObjectOutputStream O1=new ObjectOutputStream(fos);
        O1.writeObject(E1);
        FileInputStream fis=new FileInputStream("emp.txt");
        ObjectInputStream O2=new ObjectInputStream(fis);
        Object obj=O2.readObject();

    }
}

