package org.javaacademy.core.homework.homework4.ex1;

import java.math.BigDecimal;

public enum CarWashingTariff {
    SMALL(BigDecimal.valueOf(2000)),
    BIG(BigDecimal.valueOf(4000));

    private final BigDecimal price;

    CarWashingTariff(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
