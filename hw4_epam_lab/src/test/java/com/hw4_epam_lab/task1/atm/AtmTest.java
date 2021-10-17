package com.hw4_epam_lab.task1.atm;

import com.hw4_epam_lab.task1.atm.card.Card;
import com.hw4_epam_lab.task1.atm.card.DebitCard;
import com.hw4_epam_lab.task1.atm.card.NoMoneyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AtmTest {
    private Card card;
    private Atm cardAtm;

    @BeforeEach
    public void init() {
        card = new DebitCard(50, "Bob");
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
        //given
        int expectedBalance = 50;
        //when
        cardAtm.cardBalance();
        //then
        assertThat(card.getAccountBalance()).isEqualTo(expectedBalance);
    }

    @Test
    void addAtm_showNewBalanceCard_whenAdd() {
        //given
        int expectedBalance = 70;
        //when
        cardAtm.addAtm(20);
        //then
        assertThat(card.getAccountBalance()).isEqualTo(expectedBalance);
    }

    @Test
    void convertAtm_showConvertBalanceCard_whenConvert() {
        //given
        int expectedBalance = 500;
        //when
        cardAtm.convertAtm(10);
        //then
        assertThat(card.getAccountBalance())
                .isEqualTo(expectedBalance);
    }

    @Test
    void withdrawAtm_showException_whenWithdrawSoMuch() {
        //then
        assertThatThrownBy(() -> cardAtm.withdrawAtm(10))
                .isInstanceOf(NoMoneyException.class)
                .hasMessage("Недостаточно средств");

    }
}

