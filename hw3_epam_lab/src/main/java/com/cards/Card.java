package com.cards;

public abstract class Card {
    protected double accountBalance;
    private final String holderName;

    public Card(double accountBalance, String holderName) {
        this.accountBalance = accountBalance;
        this.holderName = holderName;
    }

    public Card(String holderName) {
        this.holderName = holderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getHolderName() {
        return holderName;
    }

    public double addBalance(double money) {
        accountBalance = accountBalance + money;
        return accountBalance;
    }

    public double withdrawBalance(double money) {
        accountBalance = accountBalance - money;
        return accountBalance;
    }

    public double convertBalance(double rate) {
        return accountBalance * rate;
    }

    {
    }

}
