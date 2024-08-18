package org.javaacademy.core.homework.homework3.factory_phone.component;

/**
 * Процессор
 */
public class Cpu {
    private int mhz; //количество мегагерц

    public Cpu(int mhz) {
        this.mhz = mhz;
    }

    public int getMhz() {
        return mhz;
    }

    @Override
    public String toString() {
        return "Cpu{" +
               "mhz=" + mhz +
               '}';
    }
}
