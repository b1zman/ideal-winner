package com.cards;

public class CreditCard extends Card {
    public CreditCard(double accountBalance, String holderName) {
        super(accountBalance, holderName);
    }

    public CreditCard(String holderName) {
        super(holderName);
    }

    @Override
    public String getHolderName() {
        return super.getHolderName();
    }

    @Override
    public double addBalance(double money) {
        return super.addBalance(money);
    }

    @Override
    public double getAccountBalance() {
        return super.getAccountBalance();
    }

    @Override
    public double withdrawBalance(double money) {
        return super.withdrawBalance(money);
    }
}