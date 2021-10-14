package com.cards;

public class DebetCard extends Card {
    public DebetCard(double accountBalance, String holderName) {
        super(accountBalance, holderName);
    }

    @Override
    public double withdrawBalance(double money) {
        if (accountBalance < money) {
            throw new NoMoneyException("Недостаточно средств");
        }
        accountBalance = accountBalance - money;
        return accountBalance;
    }
}
