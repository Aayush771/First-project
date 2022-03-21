package com.masai.unit_4.Evaluation_C2.Q2;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args){
            Scanner Sc = new Scanner(System.in);
            String s1 = Sc.next();
            StringManipulator m1 = new StringManipulator();
            System.out.println(m1.removeVowels(s1));
        }


    public String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    }
