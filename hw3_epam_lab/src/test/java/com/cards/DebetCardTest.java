package com.cards;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DebetCardTest {

    @Test
    void addBalance_ShowReturnBalance_WhenAddBalance() {
        DebetCard card = new DebetCard(110, "Bob");
        double balance = card.addBalance(30);
        assertEquals(balance, 110, 0.0000000001);
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

    @Test
    public void withBalance_Exception_WhenWithdrawMuchMoney() {
        final DebetCard expectEx = new DebetCard(1, "Bob");
        assertThatThrownBy(() -> expectEx.withdrawBalance(10)).isInstanceOf(NoMoneyException.class);
    }


}



