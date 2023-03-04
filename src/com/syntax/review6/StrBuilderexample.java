package com.syntax.review6;

public class StrBuilderexample {

    public static void main(String[] args) {


        // this class is mutable collection of character
        StringBuilder sb = new StringBuilder("Hello");

        //all changes happens on the same object
        sb.reverse(); // proves e string builder is mutable

        System.out.println(sb); // olleH

        String str = sb.toString();
        str.toUpperCase(); // proves that String is immutable

        System.out.println(str); // olleH

    }
}