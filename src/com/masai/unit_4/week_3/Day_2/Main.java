package com.masai.unit_4.week_3.Day_2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date of Joining in dd/MM/yyyy pattern");
        String doj = sc.next();
           try {
               LocalDate d1 = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

               LocalDate c = LocalDate.now();

               Period P = Period.between(d1, c);
               EmployeeBonus em = new EmployeeBonus();
               System.out.println(em.Bonus(P.getYears()));

           }
           catch (DateTimeException e){
               System.out.println("Please pass the date in correct format");
           }
    }

}
