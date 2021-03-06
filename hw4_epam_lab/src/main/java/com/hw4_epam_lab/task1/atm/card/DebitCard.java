package com.hw4_epam_lab.task1.atm.card;

public class DebitCard extends Card {

    public DebitCard(double accountBalance, String holderName) {
        super(accountBalance, holderName);
    }

    public double getAccountBalance() {
        return super.getAccountBalance();
    }

    public String getHolderName() {
        return super.getHolderName();
    }

    public double addBalance(double money) {
        return super.addBalance(money);
    }

    public double withdrawBalance(double money) {
        if (super.accountBalance < money) {
            throw new NoMoneyException("Недостаточно средств");
        } else {
            super.accountBalance -= money;
            return super.getAccountBalance();
        }
    }

    public double convertBalance(double rate) {
        return super.convertBalance(rate);
    }
}


