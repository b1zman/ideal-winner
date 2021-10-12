package com.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class DebetCardTest {

    @Test
    void addBalance_ShowReturnBalance_WhenAddBalance() {
        DebetCard card = new DebetCard(100, "Bob");
        double balance = card.addBalance(30);
        assertEquals(balance, 130, 0.0000000001);
    }

    @Test
    void withdrawBalance_ShowReturnBalance_WhenWithdrawBalance() {
        DebetCard card = new DebetCard(100, "Bob");
        double balance = card.withdrawBalance(10);
        assertEquals(balance, 90, 0.000001);
    }

    @Test
    void getAccountBalance_ShowReturnBalance() {
        DebetCard card = new DebetCard(100, "Bob");
        double balance = card.getAccountBalance();
        assertEquals(balance, 100, 0.000001);
    }

    @Test
    void convertBalance_ShowReturnConvert_WhenConvertBalance() {
        DebetCard card = new DebetCard(100, "Bob");
        double balance = card.convertBalance(20);
        assertEquals(balance, 2000, 0.000001);
    }
}