package com.akanksha;

public class Account {

    private   float balance;

    public void setBalance(float balance){
        if(balance>0)
        this.balance=balance;
    }

    public float returnBalance(){
        return balance;
    }

    public void deposit(float amount){
        balance +=amount;
    }

    public void withdraw(float amount){
        balance-= amount;
    }
}
