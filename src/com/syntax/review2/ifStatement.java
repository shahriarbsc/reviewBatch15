package com.syntax.review2;

public class ifStatement {
    public static void main(String[] args) {


        /* is statement - conditional statement
        if (boolean condition) {}
        code;
        curley bracket is block of code
*/
// >, <=, <, <=, !=, ==

        // = assign operator
        // == relational operators
        int day = 2;

        if (day==1) {

            System.out.println("it is the first day of the month");
        }
        String month = "December";  // for string we use writing equal than =
        if (month.equals ("December")){

            System.out.println("It is Christmas time");
        }
        boolean evening=true;
        if (evening){

            System.out.println("I might have a class at Syntax");
        }



    }
}