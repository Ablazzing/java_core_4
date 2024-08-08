package org.javaacademy.core.lesson5.lottery;

/**
 * Билет
 */
public class Ticket {
    private static int ticketCount = 0;
    private int winSum = 0;

    public Ticket() {
        ticketCount++;
        if (ticketCount % 1000 == 0) {
            winSum = 1_000_000;
        }
    }

    public int getWinSum() {
        return winSum;
    }
}
