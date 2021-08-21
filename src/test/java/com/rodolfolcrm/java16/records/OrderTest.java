package com.rodolfolcrm.java16.records;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {

    private static final int ORDER_ID = new Random().nextInt();
    private static final LocalDate NOW = LocalDate.now();
    private static final double AMOUNT = new Random().nextDouble();

    @Test
    public void build_order() {
        var order = new Order(ORDER_ID, NOW, AMOUNT);
        assertThat(order.orderId()).isEqualTo(ORDER_ID);
        assertThat(order.date()).isEqualTo(NOW);
        assertThat(order.amount()).isEqualTo(AMOUNT);
    }

    @Test
    public void should_be_equals_for_same_orders() {
        var order1 = new Order(ORDER_ID, NOW, AMOUNT);
        var order2 = new Order(ORDER_ID, NOW, AMOUNT);
        assertThat(order1).isEqualTo(order2);
    }

    @Test
    public void should_not_be_equals_for_different_orders() {
        var order1 = new Order(ORDER_ID, NOW, AMOUNT);
        var order2 = new Order(new Random().nextInt(), LocalDate.now(), new Random().nextDouble());
        assertThat(order1).isNotEqualTo(order2);
    }
}
