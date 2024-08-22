package org.javaacademy.core.lesson9.ex5;

public class Runner {
    public static void main(String[] args) {
        //вертолет - летит вперед
        //ящерицу - ползет вперед
        //лодка - плывет вперед

        Movable helicopter = new Movable() {
            @Override
            public void go() {
                System.out.println("Вертолет летит вперед");
            }
        };
        Movable reptile = new Movable() {
            @Override
            public void go() {
                System.out.println("Ящерица ползет вперед");
            }
        };
        Movable boat = () -> System.out.println("Лодка плывет вперед");
        Movable[] movables = {helicopter, reptile, boat};
        for (Movable movable : movables) {
            movable.go();
        }


    }
}
