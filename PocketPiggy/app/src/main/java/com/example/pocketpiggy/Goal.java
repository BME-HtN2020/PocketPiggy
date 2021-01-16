package com.example.pocketpiggy;

public class Goal {
    String name;
    double amountSaved;
    double totalAmount;
    boolean isReached;

    public Goal(String name, double totalAmount) {
        this.name = name;
        this.totalAmount = totalAmount;
        this.amountSaved = 0;
        this.isReached = false;
    }

    public String getName() {
        return this.name;
    }

    public double getAmountSaved() {
        return this.amountSaved;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public boolean getIsReached() {
        return this.isReached;
    }

    public boolean addSaving(double val) {
        this.amountSaved += val;
        if (this.amountSaved >= this.totalAmount) {
            this.isReached = true;
        }
        return this.isReached;
    }
}
