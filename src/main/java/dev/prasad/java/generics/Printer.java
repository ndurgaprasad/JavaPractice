package dev.prasad.java.generics;

public class Printer<T> {
    private final T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(this.thingToPrint);
    }
}
