package com.atw;

import com.atw.card.Card;
import com.atw.card.DebetCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtwTest {

    @Test
    void withdrawAtw_ShowNewBalanceCard_WhenWithdraw() {
        Card card = new DebetCard(50, "Bob");
        Atm cardAtm = new Atm(card);
        cardAtm.withdrawAtm(30);
        assertEquals(card.getAccountBalance(), 20, 0.0000001);
    }

    @Test
    void cardBalance_ShowBalanceCard() {
        Card card = new DebetCard(50, "Bob");
        Atm cardAtm = new Atm(card);
        cardAtm.cardBalance();
        assertEquals(card.getAccountBalance(), 50, 0.0000001);
    }

    @Test
    void addAtw_ShowNewBalanceCard_WhenAdd() {
        Card card = new DebetCard(50, "Bob");
        Atm cardAtm = new Atm(card);
        cardAtm.addAtm(30);
        assertEquals(card.getAccountBalance(), 80, 0.0000001);
    }


    @Test
    void convertAtw_ShowConvertBalanceCard_WhenConvert() {
        Card card = new DebetCard(5, "Bob");
        Atm cardAtm = new Atm(card);
        cardAtm.convertAtm(10);
        assertEquals(card.getAccountBalance(), 50, 0.00000001);
    }
}