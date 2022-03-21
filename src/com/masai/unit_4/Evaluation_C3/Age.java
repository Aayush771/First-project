package com.masai.unit_4.Evaluation_C3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your Date of birth in dd/MM/yyyy");
        String dob=Sc.next();
        try {
            LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate c = LocalDate.now();
            Period p = Period.between(d1, c);
            if(p.getYears()<0){
                System.out.println("Date of birth should not be in future");
            }
            else
            System.out.println(p.getYears());
        }
        catch (Exception err){
            System.out.println("please pass the date in the proper format");
        }
    }

}
