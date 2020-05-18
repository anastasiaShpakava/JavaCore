package com.company;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.AutoCloseable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Massive massive = new Massive();
        try {
            massive.multiCatch();
        } catch (ArithmeticException ex) {
            System.out.println("You can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        System.out.println("You don't have access to the third element");
        try {
            massive.printArray();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You can't print this array with size " + " " + ex.getMessage());
        }
        try {
            massive.multiCatch();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            System.out.println("Error" + " " + ex.getMessage());
        }

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter size of mas2");
            int n2 = scanner.nextInt();
            massive.exampleWithFinally();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You can't print mas2 with this size");
        } finally {

            System.out.println("That's life");
        }
        /////////////////////////////////////// дополнительное задание
////////////////////////1
        try (PrintStream stream = new PrintStream("hello.txt")) {
            System.out.println("Hello world!");
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot open the file");
        } finally {
            System.err.println("All done");
        }
        /////////////////2
        try {
            int a = 0;
            int b = 218 / a;
            massive.procedure();
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero: " + ex);
        }
        ////////////////////////3
        try {
            System.out.println("Если после этой строчки ничего не будет, то оператор finally не вызвался");
            System.exit(0);
        } finally {
            System.out.println("Hello!!!!!");
        }
    }
}
public class Massive {

    private int n = 0;
    private int[] mas = new int[n];
    private int b;
    private int n2;
    private int[] mas2 = new int[n2];

    public Massive() throws FileNotFoundException {
    }

    public void printArray() {
        n = 5;
        System.out.println(mas[6]);
    }
    public void multiCatch() {

        b = 42 / n;
        mas[2] = 99;
        System.out.println("Access to the third element" + " " + mas[3]);
    }
    public void exampleWithFinally() {
        mas2[5] = 4;
        if (n2 > 6) {
            System.out.println("You can't print mas2");
        }
    }
    void procedure() {
        try {
            int a[] = {1};
            a[34] = 218;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index is " + " " + ex);
        }
    }
}
