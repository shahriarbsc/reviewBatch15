package com.syntax.review5;

public class Task6GProject {
    public static void main(String[] args) {

        // write a program to swap 2 numbers without a temporary variable?


        int a = 20;
        int b = 50;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a + ", b: " + b);

    }
}



