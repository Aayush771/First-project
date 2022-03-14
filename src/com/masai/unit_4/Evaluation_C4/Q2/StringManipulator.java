package com.masai.unit_4.Evaluation_C4.Q2;

import java.util.Scanner;

public class StringManipulator {
    public String removeVowels(String str)
    {
      StringBuilder str1= new StringBuilder();
      for(int i=0;i<str.length();i++){
         if(str.charAt(i) =='a'){
             continue;
         }
         else if(str.charAt(i) !='e'){
           continue;
          }
          else if(str.charAt(i) !='i'){
            continue;
          }
          else if(str.charAt(i) !='o'){
              continue;
          }
          else if(str.charAt(i) !='u'){
           continue;
          }
          else{
              str1.append(str.charAt(i));
         }
      }
      return str1.toString();
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String s1=Sc.next();
      StringManipulator s2=new StringManipulator();
      String i=s2.removeVowels(s1);
        System.out.println(i);
    }
}
