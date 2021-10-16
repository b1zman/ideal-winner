package com.hw4_epam_lab.task1.atm.card;

public abstract class Card {
    protected double accountBalance;
    private String holderName;

    Card(double accountBalance, String holderName) {
        this.accountBalance = accountBalance;
        this.holderName = holderName;
    }

    Card(String holderName) {
        this.holderName = holderName;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public double addBalance(double money) {
        this.accountBalance += money;
        return this.accountBalance;
    }

    public double withdrawBalance(double money) {
        this.accountBalance -= money;
        return this.accountBalance;
    }

    public double convertBalance(double rate) {
        this.accountBalance *= rate;
        return this.accountBalance;
    }

}


