package org.javaacademy.core.lesson5.lottery;

public class Runner {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[2000];
        for (int i = 0; i < 2000; i++) {
            tickets[i] = new Ticket();
        }
        Ticket lastTicket = tickets[1999];
        System.out.println("В 1000 билете сумма выигрыша: " + lastTicket.getWinSum());
    }
}
