package org.javaacademy.core.homework.homework4.ex1;

import org.javaacademy.core.homework.homework4.ex1.car.Car;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

/**
 * Автомойка
 */
public class CarWashing {
    private final static double LENGTH_BIG_CAR = 6;
    private final static double HEIGHT_BIG_CAR = 2.5;
    private final static double WIDTH_BIG_CAR = 2;

    public BigDecimal wash(Car car) {
        car.setClean(true);
        if (car.getLength() > LENGTH_BIG_CAR
            || car.getHeight() > HEIGHT_BIG_CAR
            || car.getWidth() > WIDTH_BIG_CAR) {
            return CarWashingTariff.BIG.getPrice();
        }
        return CarWashingTariff.SMALL.getPrice();
    }

    public BigDecimal wash(Car... cars) {
        BigDecimal totalResult = ZERO;
        for (Car car : cars) {
            totalResult = totalResult.add(wash(car));
        }
        return totalResult;
    }
}
