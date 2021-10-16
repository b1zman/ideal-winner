package com.hw4_epam_lab.task1.atm;

import com.hw4_epam_lab.task1.atm.card.Card;
import com.hw4_epam_lab.task1.atm.card.DebetCard;
import com.hw4_epam_lab.task1.atm.card.NoMoneyException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtmTest {

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

    @Test
    void withdrawAtw_ShowException_WhenWithdrawSoMuch() {
        Card card = new DebetCard(50, "Bob");
        Atm cardAtm = new Atm(card);
        cardAtm.withdrawAtm(80);
        assertEquals(cardAtm.cardBalance(), no, "Недостаточно средств");
        assertThatTrowBy()

    }

}