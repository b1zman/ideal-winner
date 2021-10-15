package com.atw.card;

public class CreditCard extends Card {
    public CreditCard(double accountBalance, String holderName) {
        super(accountBalance, holderName);
    }

    public CreditCard(String holderName) {
        super(holderName);
    }

    public String getHolderName() {
        return super.getHolderName();
    }

    public double addBalance(double money) {
        return super.addBalance(money);
    }

    public double getAccountBalance() {
        return super.getAccountBalance();
    }

    public double withdrawBalance(double money) {
        return super.withdrawBalance(money);
    }
}


