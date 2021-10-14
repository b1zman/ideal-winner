package com.cards;

public class DebetCard extends Card {
    private double accountBalance;

    public DebetCard(double accountBalance, String holderName) {
        super(holderName);
        this.accountBalance = accountBalance;
    }

    @Override
    public String getHolderName() {
        return super.getHolderName();
    }

    @Override
    public double addBalance(double money) {
        return accountBalance;
    }

    @Override
    public double withdrawBalance(double money) {
        if (accountBalance < money) {
            throw new NoMoneyException("Недостаточно средств");
        }
        accountBalance = accountBalance - money;
        return accountBalance;
    }

    @Override
    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public double convertBalance(double rate) {
        return accountBalance * rate;
    }
}
