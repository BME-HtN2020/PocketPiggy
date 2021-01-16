package com.example.pocketpiggy;

public class Account {
    double balance;

    public Account() {
        this.balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addBalance(double balance) {
        this.balance += balance;
    }

    public void withdrawBalance(double balance) {
        this.balance -= balance;
    }

    public String formatter() {
        double a = this.balance * 100;
        int b = (int)a;
        double c = (double)b / 100;
        if (b % 10 == 0) return "$" + c + "0";
        else return "$" + c;
    }
}
