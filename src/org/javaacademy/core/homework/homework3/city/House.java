package org.javaacademy.core.homework.homework3.city;

public class House implements Cloneable {
    private String street;
    private String houseNumber;

    public House(String street, String houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "House{" +
               "street='" + street + '\'' +
               ", houseNumber='" + houseNumber + '\'' +
               '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
