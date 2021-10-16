package com.hw4_epam_lab.task1.atm;

import com.hw4_epam_lab.task1.atm.card.Card;
import com.hw4_epam_lab.task1.atm.card.DebetCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AtmTest {
    private Card card;
    private Atm cardAtm;

    @BeforeEach
    public void init() {
        card = new DebetCard(50, "Bob");
        cardAtm = new Atm(card);
    }

    @Test
    void withdrawAtm_showNewBalanceCard_whenWithdraw() {
        //given
        int expectedBalance = 30;
        //when
        cardAtm.withdrawAtm(20);
        //then
        assertThat(card.getAccountBalance()).isEqualTo(expectedBalance);
    }

    @Test
    void cardBalance_showBalanceCard() {
        Card card = new DebetCard(50, "Bob");
        Atm cardAtm = new Atm(card);
        cardAtm.cardBalance();
        assertEquals(card.getAccountBalance(), 50, 0.0000001);
    }

    @Test
    void addAtm_showNewBalanceCard_whenAdd() {
        Card card = new DebetCard(50, "Bob");
        Atm cardAtm = new Atm(card);
        cardAtm.addAtm(30);
        assertEquals(card.getAccountBalance(), 80, 0.0000001);
    }


    @Test
    void convertAtm_showConvertBalanceCard_whenConvert() {
        Card card = new DebetCard(5, "Bob");
        Atm cardAtm = new Atm(card);
        cardAtm.convertAtm(10);
        assertEquals(card.getAccountBalance(), 50, 0.00000001);
    }

  /*  @Test
    void withdrawAtm_showException_whenWithdrawSoMuch() {
        Card card = new DebetCard(50, "Bob");
        Atm cardAtm = new Atm(card);
        cardAtm.withdrawAtm(80);
        assertEquals(cardAtm.cardBalance(), no, "Недостаточно средств");

*/
}

