package dev.prasad.java.generics;

public class GenericMain {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(12);
        integerPrinter.print();

        Printer<String> stringPrinter = new Printer<>("Hello.. Prasad");
        stringPrinter.print();
    }
}
