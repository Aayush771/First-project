package com.masai.unit_4.week_3.Day_2;

public class EmployeeBonus {

    int Bonus(int exp) throws InvalidAgeException {
        int bonus=0;
        if(exp<1){
            bonus=5000;
        }
        if(exp<2){
            bonus=8000;
        }
        if(exp>=2){
            bonus=10000;
        }
        else{
            throw new InvalidAgeException("Age should not be in the future ");
        }
        return bonus;
    }

}
