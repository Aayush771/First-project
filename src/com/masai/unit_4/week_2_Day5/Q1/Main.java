package com.masai.unit_4.week_2_Day5.Q1;

public class Main {
    public static void main(String[] args) {
        Animal[] obj =new Animal[3];
        obj[0]=new Cat();
        obj[1]=new Dog();
        obj[2]=new Tiger();
        obj[0].makeNoise();
        obj[0].eat();
        obj[0].walk();
        obj[1].makeNoise();
        obj[1].eat();
        obj[1].walk();
        obj[2].makeNoise();
        obj[2].eat();
        obj[2].walk();

//        animal[0]= new Cat();
    }
}
