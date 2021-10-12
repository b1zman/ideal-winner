package com.cards;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void getHolderName_ShowName() {
        CreditCard card = new CreditCard("Bob");
        String name = card.getHolderName();
        Assert.assertEquals(name,"Bob");

    }

    @Test
    void addBalance_ShowReturnBalance_WhenAddBalance() {
        CreditCard card = new CreditCard(100,"Bob");
        double balance = card.addBalance(150);
        assertEquals(balance, 250, 0.00000001);
    }

    @Test
    void withdrawBalance_ShowReturnBalance_WhenWithdrawBalance() {
        CreditCard card = new CreditCard(100,"Bob");
        double balance = card.withdrawBalance(150);
        assertEquals(balance, -50, 0.00000001);
    }
}