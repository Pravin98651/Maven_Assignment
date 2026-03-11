package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {

        App calc = new App();

        System.out.println("Add: " + calc.add(10,5));
        System.out.println("Subtract: " + calc.subtract(10,5));
        System.out.println("Multiply: " + calc.multiply(10,5));
        System.out.println("Divide: " + calc.divide(10,5));
    }
}
