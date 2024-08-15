package org.javaacademy.core.lesson8.ex3;

public class Runner {
    public static void main(String[] args) {
        //У нас есть лесорубка
        //На лесорубке есть лесоруб
        //У лесоруба есть топор
        //Топор обладает свойством - сломан или нет
        //Если топор сломан, лесоруб не может рубить
        //А лесорубка, зарабатывать деньги на рубке деревьев
        //Если лесоруб пьян, то работать он не может

        Axe axe = new Axe();
        Worker worker = new Worker(axe);
        Firm firm = new Firm(worker);

        firm.makeProfit();
        System.out.println("___________________________________________");

        axe.broke();
        worker.drink();
        firm.makeProfit();
    }
}
