package com.cards;

public class DebetCard extends Card {
    public static double accountBalance;

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
        return super.addBalance(money);
    }

    @Override
    public double withdrawBalance(double money) {
        if (accountBalance < money) {
            throw new NullPointerException("Недостаточно средств");
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
