package dev.prasad.java.generics;

public class SortGenericsMain {
    public static void main(String[] args) {
        Integer[]integers = { 100, 22, 58, 41, 6, 50 };
        Character[] characters = { 'v', 'g', 'a', 'c', 'x', 'd', 't' };
        String[] strings = { "Virat", "Rohit", "Abhinay", "Chandu","Sam", "Bharat", "Kalam" };

        System.out.print("Sorted Integer array :  ");
        sortArray(integers);

        System.out.print("Sorted Character array :  ");
        sortArray(characters);

        System.out.print("Sorted String array :  ");
        sortArray(strings);
    }

    public static <T extends Comparable<T>> void sortArray(T[] a) {
        // As we are comparing the Non-Primitive data types, we need to use Comparable class

        //Bubble Sort
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length -i - 1; j++) {
                if(a[j].compareTo(a[j+1]) > 0) {
                    swap(j, j+1, a);
                }
            }
        }

        // Printing the elements after sorted
        for (T t: a) {
            System.out.print(t + ", ");
        }
        System.out.println();
    }

    private static <T> void swap(int j, int i, T[] a) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
