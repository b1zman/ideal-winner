package com.cards;

public class CreditCard extends Card {
    public CreditCard(double accountBalance, String holderName) {
        super(accountBalance, holderName);
    }

    public CreditCard(String holderName) {
        super(holderName);
    }

}