package com.rodolfolcrm.java16.records;

import java.time.LocalDate;

public record Order(int orderId, LocalDate date, double amount) {
}
