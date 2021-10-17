package com.hw4_epam_lab.task1.atm;

import com.hw4_epam_lab.task1.atm.card.Card;

public class Atm {
    private Card card;

    public Atm(Card card) {
        this.card = card;
    }

    public double cardBalance() {
        return card.getAccountBalance();
    }

    public double addAtm(double money) {
        return card.addBalance(money);
    }

    public double withdrawAtm(double money) {
        return card.withdrawBalance(money);
    }

    public double convertAtm(double rate) {
        return card.convertBalance(rate);
    }
}





