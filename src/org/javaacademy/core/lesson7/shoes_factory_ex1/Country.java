package org.javaacademy.core.lesson7.shoes_factory_ex1;

public class Country {
    public static final Country RUSSIA = new Country("Russia");
    public static final Country FRANCE = new Country("France");

    private String name;

    private Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
               "name='" + name + '\'' +
               '}';
    }
}
