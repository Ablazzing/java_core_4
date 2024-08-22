package org.javaacademy.core.lesson9.ex4;

public class Runner {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer();
        swimmer.train();

        SportHuman soccerMan = new SportHuman() {
            @Override
            public void train() {
                System.out.println("Футболист бьет по мячу");
            }

            public void doSomething() {
                System.out.println("Что то делаем");
            }
        };


        //  SoccerMan soccerMan2 = new SoccerMan();
        soccerMan.train();
    }
}
