package com.syntax.review3;

public class ForLoop {
    public static void main(String[] args) {


        //Loop: They repeat a block of code based on condition
        //4 loops in JAVA
        // for


        //while
        //do while
        // for each /advanced for loop/ enhanced for loop
//1. initialization
        //2. condition
        //3. if true -> code goes inside the loop body
        // repeat

        for (int i = 1; i <= 5; i++) {

            System.out.println("Hello " + i);
        }
        System.out.println("*********************************");

        for (int a = 0; a < 8; a += 4) {

            System.out.println("Bye");
        }


        for (int i = 2; i > 10; i++) {
            System.out.println(i);
        }

        System.out.println("End");
        System.out.println("****************************************");

        /*
        for (int j=3; j<10; j--)
        {
            System.out.println(j);
        }
        */


    }
}
