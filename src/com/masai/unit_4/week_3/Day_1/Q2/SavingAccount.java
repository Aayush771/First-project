package com.masai.unit_4.week_3.Day_1.Q2;

public class SavingAccount  {
    int accountNumber=65416546;
    double Balance=600.56;
    void withdraw(double amount) throws InsufficientFundException {
        if (amount < Balance) {
            Balance -= amount;
            System.out.println("Amount has been deducted");
            System.out.println("Avilable Banlance "+Balance);
        } else {
            InsufficientFundException ife = new InsufficientFundException("Insufficient Amount in the Account");
            throw ife;
        }
    }
    void Deposit(double amount){
        Balance+= amount;
        System.out.println("Amount has been deopsited ");
        System.out.println("Avilable Banlance "+Balance);


    }
}
