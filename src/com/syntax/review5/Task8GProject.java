package com.syntax.review5;

public class Task8GProject {
    public static void main(String[] args) {

        //write a java program to print the first 10 numbers
        // fibonacci is number which add previous numbers


        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= 10; i++) {
            c = a + b;

            System.out.print(c+" ");
            a = b;
            b = c;

        }


    }
}
