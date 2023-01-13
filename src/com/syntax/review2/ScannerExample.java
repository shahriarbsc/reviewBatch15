package com.syntax.review2;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {


        // read right to the left
        int i=10;
            i= 11;
       //Non premitive data type
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Please enter your aage");
     int age= keyboard.nextInt(); // to capture int values
        System.out.println("Are you tired");


     boolean tired=keyboard.nextBoolean(); //to capture boolean values
        System.out.println("Whats your name");
     String name= keyboard.next(); // to capture String until space

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);


    }
}
