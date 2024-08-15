package org.javaacademy.core.lesson7.shoes_factory_ex1;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Factory russiaFactory = new Factory(CountryEnum.RUSSIA);
        Factory franceFactory = new Factory(CountryEnum.FRANCE);
        //Factory krokoziaFactory = new Factory(null);

        System.out.println(russiaFactory);
        System.out.println(franceFactory);
        //System.out.println(krokoziaFactory);

        System.out.println(Arrays.toString(CountryEnum.values()));

        Factory russia = new Factory(CountryEnum.valueOf("RUSSIA1"));



    }
}
