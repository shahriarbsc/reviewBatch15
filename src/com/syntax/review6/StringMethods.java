package com.syntax.review6;

public class StringMethods {

    public static void main(String[] args) {

    String str="Hello";


        System.out.println("str.length");//5
        System.out.println(str.toUpperCase());//HELLO
        System.out.println(str.charAt(1)); //e



        String newString=str.concat( " friends");

        System.out.println(newString); //Hello Friends
        System.out.println(str); //Hello because String is immutable object
        str=str.toLowerCase();

        System.out.println(str);//hello

       //check the length of the string is not more than 0.
        boolean empty=str.isEmpty();
        System.out.println(empty);

        // remove any leading or trailing white spaces.

        String str1="   Review B15      ";
        String newStr1=str1.trim();

        System.out.println(str1);
        System.out.println(newStr1);



    }
}
